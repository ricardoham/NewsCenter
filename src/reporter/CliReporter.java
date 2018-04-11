package reporter;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import comum.Cliente;
import comum.Noticia;

public class CliReporter extends Cliente {
	
    private Socket clientSocket = null;
    private ObjectOutputStream os = null;
    private ObjectInputStream is = null;
    private int port;
    private String host;
    private static InterfaceConfigReporter config;
	
    private InterfaceReporter gui;
    

	public static void main(String[] args){
		config = new InterfaceConfigReporter(new CliReporter());
		config.setVisible(true);		
	}
	
	public void conectar(int port, String host) {
		this.port = port;
		this.host = host;
	  
	    try {
	        clientSocket = new Socket(host, port);
	        os = new ObjectOutputStream(clientSocket.getOutputStream());
	        is = new ObjectInputStream(clientSocket.getInputStream());
			
			new InterfaceReporter(this).setVisible(true);
			
			config.setVisible(false);
			config.dispose();
			 
	    } catch (UnknownHostException e) {
	        System.err.println("Don't know about host " + host);
	    } catch (IOException e) {
	        System.err.println("Couldn't get I/O for the connection to the host "
		            + host);
		}
	}
	
	public void enviarNoticia(Noticia noticia) {
    	try {
    		os.writeObject(noticia);
		} catch (IOException e) {
			System.out.println("Não foi possível enviar notícia: " + e.getMessage());
		}
	}
	
	public String getIP() {
		return clientSocket.getRemoteSocketAddress().toString();
	}
}
