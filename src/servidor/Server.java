package servidor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;















import reporter.CliReporter;
import comum.Modal_About;
import comum.Modal_Help;
import comum.Noticia;



public class Server extends JFrame implements  Runnable {
	
	private static final long serialVersionUID = 1L;
    /*private final JMenuBar barraMenu = new JMenuBar();
    private final JMenu arquivo = new JMenu("Arquivo");
    private final JMenu ajuda = new JMenu("Ajuda");
    private final JMenuItem operaSair = new JMenuItem("Sair");
    private final JMenuItem operaAjuda = new JMenuItem("Ajuda");
    private final JMenuItem operaSobre = new JMenuItem("Sobre");
    */
    
    //private final JPanel fundo = new JPanel();
    private static ServerSocket serverSocket;
    private static int port = 2222;
    
    private static final ArrayList<ClientThread> threads = new ArrayList<ClientThread>();

    //private boolean execute;

    /*void telaSistema(){
    	this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5, 5));
        
        fundo.setBackground(Color.lightGray);
        fundo.setLayout(new BoxLayout(fundo, 1));
        
        arquivo.addSeparator();
        arquivo.add(operaSair);
        
        barraMenu.add(ajuda);
        
        ajuda.add(operaAjuda);
        ajuda.add(operaSobre);
        
        operaSair.addActionListener(this);
        ajuda.addActionListener(this);
        operaAjuda.addActionListener(this);
        operaSobre.addActionListener(this);
        
        setJMenuBar(barraMenu);
    } */
    
    
    public Server()
    {
    	//execute = true;
       // setVisible(true);
        Thread serverDispatcher = new Thread(this);
        serverDispatcher.start();
    }
    
    public void run(){

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started at port " + port + ".");
        } catch (Exception e) {
            System.err.println("Port " + port + " already in use.");
            System.exit(1);
        }

        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection : " + clientSocket);

                ClientThread client = new ClientThread(clientSocket);
                
                threads.add(client);

                client.start();

            } catch (Exception e) {
                System.err.println("Error in connection attempt: " + e.getCause());
            }
        }
    }
    
    public static void main(String args[])
    {
        new Server();
    }
    
 /*   public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == operaSair)
        {
        	System.exit(0);
        }
            
        else if(evento.getSource() == operaAjuda)
        {
        	Modal_Help helpScreen = new Modal_Help(this,"Ajuda");
            helpScreen.setLocationRelativeTo(getParent());
            helpScreen.setVisible(true);
        }
       
        else if(evento.getSource() == operaSobre)
        { 
        	Modal_About aboutScreen = new Modal_About(this,"Sobre");
            aboutScreen.setLocationRelativeTo(getParent());
            aboutScreen.setVisible(true);
        }
    } */
    
    public synchronized void sendToAll(Noticia noticia)
    {
    	for(int i = 0; i < threads.size(); i++)
    	{
    		ClientThread client = threads.get(i);
    		try {
				client.out.writeObject(noticia);
			} catch (IOException e) {
				client.connected = false;
			}
    	}
    }
    
    private class ClientThread extends Thread {   	
    	private Socket socket;
    	private ObjectInputStream in;
    	private ObjectOutputStream out;
    	private boolean connected = true;
    	
    	public ClientThread(Socket socket) throws IOException {
    		this.socket = socket;
    		this.out = new ObjectOutputStream(socket.getOutputStream());
    		this.in = new ObjectInputStream(socket.getInputStream());		
    	}
    	
    	public void run() {
    		while(connected) {
				try {
					Noticia noticia = (Noticia)in.readObject();
					
					sendToAll(noticia);
				} catch (ClassNotFoundException | IOException e) {
					connected = false;
				}
    		}
    		
    		close();
    	}    
    	
    	public void close() {
    		threads.remove(this);
    		try {
    			in.close();
    			out.close();
				socket.close();
			} catch (IOException e) {
				System.out.println("Error closing socket.");
			}
    	}
    }
}