package leitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import comum.Noticia;

public class InterfaceLeitor extends JFrame {

    private JButton btLimpar;
    private JButton btSair;
    private JMenuItem enviarAmigo;
    private JMenuItem conteudoAjuda;
    private JMenuItem desconectarLeitor;
    private JEditorPane jEditorPane1;
    private JLabel jLabel4;
    private JMenuBar jMenuBar1;
    private JMenuBar jMenuBar2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JPopupMenu.Separator jSeparator2;
    private JLabel labelModuloLeitor;
    private JLabel labelNomeLeitor;
    private JLabel labelNoticia;
    private JMenu menuAjuda;
    private JMenu menuArquivo;
    private JMenuItem sair;
    private JMenuItem sobre;
	private static boolean closed = false;
    
    private CliLeitor leitor;
    
    public InterfaceLeitor(CliLeitor leitor) {
    	this.leitor = leitor;
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new JPanel();
        labelModuloLeitor = new JLabel();
        labelNoticia = new JLabel();
        btLimpar = new JButton();
        btSair = new JButton();
        jScrollPane1 = new JScrollPane();
        jEditorPane1 = new JEditorPane();
        labelNomeLeitor = new JLabel();
        jLabel4 = new JLabel();
        jMenuBar1 = new JMenuBar();
        menuArquivo = new JMenu();
        enviarAmigo = new JMenuItem();
        desconectarLeitor = new JMenuItem();
        jSeparator2 = new JPopupMenu.Separator();
        sair = new JMenuItem();
        menuAjuda = new JMenu();
        conteudoAjuda = new JMenuItem();
        sobre = new JMenuItem();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelModuloLeitor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelModuloLeitor.setText("Módulo Leitor");

        labelNoticia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNoticia.setText("Notícia:");
        
        jEditorPane1.setEnabled(false);
        jEditorPane1.setContentType("text/html");


        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btSairActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jEditorPane1);

        labelNomeLeitor.setText("Nome:");
        jLabel4.setText(leitor.getNome());

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btLimpar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btSair, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(labelModuloLeitor)))
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNoticia)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNomeLeitor)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelModuloLeitor)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeLeitor)
                    .addComponent(jLabel4))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNoticia, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                        .addGap(427, 427, 427))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair)))
        );

        menuArquivo.setText("Arquivo");

        enviarAmigo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        enviarAmigo.setText("Enviar notícia a um amigo");
        enviarAmigo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                enviarNoticiaActionPerformed(evt);
            }
        });
        menuArquivo.add(enviarAmigo);

        desconectarLeitor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
        desconectarLeitor.setText("Desconectar");
        menuArquivo.add(desconectarLeitor);
        menuArquivo.add(jSeparator2);

        sair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        sair.setText("Sair");
        menuArquivo.add(sair);

        jMenuBar1.add(menuArquivo);

        menuAjuda.setText("Ajuda");

        conteudoAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
        conteudoAjuda.setText("Conteúdo da Ajuda");
        conteudoAjuda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                conteudoAjudaActionPerformed(evt);
            }
        });
        menuAjuda.add(conteudoAjuda);

        sobre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
        sobre.setText("Sobre");
        menuAjuda.add(sobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>     
    
    private void btSairActionPerformed(ActionEvent evt){
    	System.exit(NORMAL);
    }

    private void btLimparActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void enviarNoticiaActionPerformed(ActionEvent evt) {                                               
    	String email = JOptionPane.showInputDialog("Digite o e-mail do destinatário:");
    	
        /*String from = "projeto02java@gmail.com";

        Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, "teste5563");
			}
		  });

		try {
			 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject(leitor.getNome() + " enviou uma notícia para você!");
			message.setText(jEditorPane1.getText());
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
     }*/
    }                                              

    private void conteudoAjudaActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }

    public void mostrarNoticia(Noticia noticia) {
    	JLabel autor = new JLabel();
    	JLabel IP = new JLabel();

    	autor.setText(noticia.getNome());
    	IP.setText(noticia.getIP());
    	
    	String imagem = "";
    	
    	
    	if(noticia.getImagem() != null && noticia.getImagem() != "")
    	{
    		imagem = "<img src=\"" + noticia.getImagem() + "\" />";
    	}    		
    	
    	jEditorPane1.add(autor);
    	jEditorPane1.add(IP);
    	jEditorPane1.setText(imagem + 
    			 "<strong>Autor:</strong> " 
    			+ noticia.getReporter().getNome() 
    			+ "\n" + "IP: " + noticia.getIP() 
    			+ "\n\n" + noticia.getTexto());
    }
}
