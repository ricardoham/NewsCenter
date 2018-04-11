package leitor;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import comum.Cliente;
import comum.Noticia;
import reporter.CliReporter;
import reporter.InterfaceConfigReporter;
import reporter.InterfaceReporter;

public class CliLeitor extends Cliente {    
	
	private static Socket clientSocket = null;
	private static ObjectOutputStream out = null;
	private static ObjectInputStream in = null;
	private static boolean closed = false;
	private int port;
	private String host;
    private static InterfaceConfigLeitor config;
                                     
	private InterfaceLeitor gui;
	
	public static void main(String[] args){
		config = new InterfaceConfigLeitor(new CliLeitor());
		config.setVisible(true);			
	}
		  
	   
	public void conectar() {
		  port = 2222;
		  host = "localhost";
		  
		    try {
		        clientSocket = new Socket(host, port);
		        out = new ObjectOutputStream(clientSocket.getOutputStream());
		        in = new ObjectInputStream(clientSocket.getInputStream());
				  
		        gui = new InterfaceLeitor(this);
		        gui.setVisible(true);
				
				config.setVisible(false);
				config.dispose();	
				
				new RecebeNoticiaTask().start();
				 
		      } catch (UnknownHostException e) {
		        System.err.println("Don't know about host " + host);
		      } catch (IOException e) {
		        System.err.println("Couldn't get I/O for the connection to the host "
		            + host);
		      }
	} 

	private class RecebeNoticiaTask extends Thread {
		@Override
		public void run() {  	
	        try {
	          while (!closed) {
	    		  Noticia noticia = (Noticia)in.readObject();
	    		  System.out.println("Recebendo notícia...");
	    		  gui.mostrarNoticia(noticia);
	          }
	          closed = true;
	        } catch (IOException e) {         
	        	System.out.println("Error: " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
