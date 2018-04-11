package reporter;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import comum.Cliente;
import comum.Modal_About;
import comum.Modal_Help;
import comum.Noticia;


public class InterfaceReporter extends JFrame {

    // Variables declaration - do not modify                     
    private JButton btEnviar;
    private JButton btInserirLinks;
    private JButton btProcurarAudio;
    private JButton btProcurarImagem;
    private JMenuItem conectarReporter;
    private JMenuItem conteudoAjuda;
    private JMenuItem desconectarReporter;
    private JButton btLimpar;
    private JButton btCancelar;
    private JEditorPane jEditorPane;
    private JLabel jLabel7;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem3;
    private JPanel jPanel1;
    private JScrollPane jScrollPane2;
    private JPopupMenu.Separator jSeparator1;
    private JLabel labeInserirEnderecoIP;
    private JLabel labelAudio;
    private JLabel labelEnderecoIP;
    private JLabel labelImagem;
    private JLabel labelLinks;
    private JLabel labelModuloReporter;
    private JLabel labelNomeReporter;
    private JLabel labelNoticia;
    private JMenu menuAjuda;
    private JMenu menuArquivo;
    private JMenuItem sair;
    private JMenuItem sobre;
    private File img;
    
    private CliReporter reporter;    
    
    public InterfaceReporter(CliReporter reporter) {        
        this.reporter = reporter;
        
        initComponents();
    }
                        
    private void initComponents() {


        jMenuItem3 = new JMenuItem();
        jPanel1 = new JPanel();
        labelNomeReporter = new JLabel();
        labelEnderecoIP = new JLabel();
        labelNoticia = new JLabel();
        labelImagem = new JLabel();
        btProcurarImagem = new JButton();
        btEnviar = new JButton();
        btLimpar = new JButton();
        btCancelar = new JButton();
        labelAudio = new JLabel();
        btProcurarAudio = new JButton();
        labelModuloReporter = new JLabel();
        jLabel7 = new JLabel();
        labeInserirEnderecoIP = new JLabel();
        labelLinks = new JLabel();
        btInserirLinks = new JButton();
        jScrollPane2 = new JScrollPane();
        jEditorPane = new JEditorPane();
        jMenuBar1 = new JMenuBar();
        menuArquivo = new JMenu();
        conectarReporter = new JMenuItem();
        desconectarReporter = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        sair = new JMenuItem();
        menuAjuda = new JMenu();
        conteudoAjuda = new JMenuItem();
        sobre = new JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelNomeReporter.setText("Nome do Repórter:");
        jLabel7.setText(reporter.getNome());

        labelEnderecoIP.setText("Endereço IP:");
        labeInserirEnderecoIP.setText(reporter.getIP());

        labelNoticia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNoticia.setText("Notícia:");

        labelImagem.setText("Inserir Imagem:");

        btProcurarImagem.setText("Procurar...");
        btProcurarImagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btProcurarImagemActionPerformed(evt);
            }
        });

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btLimparActionPerformed(evt);
            	jEditorPane.setText("");
            }
        });
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        labelAudio.setText("Inserir Áudio:");

        btProcurarAudio.setText("Procurar...");
        btProcurarAudio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btProcurarAudioActionPerformed(evt);
            }
        });

        labelModuloReporter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelModuloReporter.setText("Módulo Repórter");

        labelLinks.setText("Inserir Links:");

        btInserirLinks.setText("Inserir...");
        btInserirLinks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btInserirLinksActionPerformed(evt);
            }
        });

        jEditorPane.setContentType("text/plain\ntext/html"); // NOI18N
        jScrollPane2.setViewportView(jEditorPane);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(btEnviar, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btLimpar, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btCancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNoticia)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 611, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelAudio)
                                    .addComponent(labelImagem)
                                    .addComponent(btProcurarImagem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btProcurarAudio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelLinks)
                                    .addComponent(btInserirLinks, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomeReporter)
                                    .addComponent(labelEnderecoIP))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labeInserirEnderecoIP, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(labelModuloReporter)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelModuloReporter)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeReporter)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoIP)
                    .addComponent(labeInserirEnderecoIP, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelImagem)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btProcurarImagem))
                            .addComponent(labelNoticia))
                        .addGap(46, 46, 46)
                        .addComponent(labelAudio)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btProcurarAudio)
                        .addGap(44, 44, 44)
                        .addComponent(labelLinks)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btInserirLinks)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btEnviar)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btCancelar)
                        .addComponent(btLimpar)))
                .addGap(40, 40, 40))
        );

        menuArquivo.setText("Arquivo");

        conectarReporter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        conectarReporter.setText("Conectar um Novo Repórter");
        conectarReporter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                conectarReporterActionPerformed(evt);
            }
        });
        menuArquivo.add(conectarReporter);

        desconectarReporter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
        desconectarReporter.setText("Desconectar");
        desconectarReporter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                desconectarReporterActionPerformed(evt);
            }
        });
        menuArquivo.add(desconectarReporter);
        menuArquivo.add(jSeparator1);

        sair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        sair.setText("Sair");
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sairActionPerformed(evt);
                
            }
        });
        menuArquivo.add(sair);

        jMenuBar1.add(menuArquivo);

        menuAjuda.setText("Ajuda");
        
        JFrame eu = this;

        conteudoAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
        conteudoAjuda.setText("Conteúdo de Ajuda");
        conteudoAjuda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                conteudoAjudaActionPerformed(evt, eu);
                
            }
        });
        menuAjuda.add(conteudoAjuda);

        sobre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
        sobre.setText("Sobre");
        sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               sobreActionPerformed(evt, eu);
                
            }
        });
        
        menuAjuda.add(sobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>   

    private void btEnviarActionPerformed(ActionEvent evt) {
    	Noticia noticia = new Noticia();
    	Cliente cliente = new Cliente();
    	cliente.setNome(reporter.getNome());
    	
    	noticia.setReporter(cliente);
    	noticia.setTexto(jEditorPane.getText());
    	noticia.setIP(reporter.getIP());    	

    	if(img != null) {
    		
    		SecureRandom random = new SecureRandom();

            String filename = img.getAbsolutePath();
			BufferedImage bi;
			try {
				bi = ImageIO.read(new File(img.getAbsolutePath()));
			
	    		filename = new BigInteger(30, random).toString(32) + ".png";
				
	            File outputfile = new File(filename);
				ImageIO.write(bi, "png", outputfile);
				noticia.setImagem(filename);
				
			} catch (IOException e1) {
				System.out.println("Erro ao salvar imagem.");
			}	
    	}
    	
    	reporter.enviarNoticia(noticia);
    }                                        

    private void btCancelarActionPerformed(ActionEvent evt) {                                         
    	System.exit(NORMAL);
    }         
    
    private void btLimparActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    
    private void btProcurarImagemActionPerformed(ActionEvent evt) {                                                 
    	JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        img = chooser.getSelectedFile();
    }

    private void btProcurarAudioActionPerformed(ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void btInserirLinksActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                      
         

    private void conectarReporterActionPerformed(ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void desconectarReporterActionPerformed(ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   


    private void conteudoAjudaActionPerformed(ActionEvent evt, JFrame eu) {                                              
     if(evt.getSource()==conteudoAjuda){
    	 Modal_Help helpScreen = new Modal_Help(eu, "Ajuda Projeto");
    	 helpScreen.setLocationRelativeTo(null);
    	 helpScreen.setVisible(true);
     }

    } 
    
    private void sobreActionPerformed(ActionEvent evt, JFrame eu) {
    if(evt.getSource()== sobre ){
   	 Modal_About aboutScreen = new Modal_About(this, "Sobre");
   	   aboutScreen.setLocationRelativeTo(null);
       aboutScreen.setVisible(true);
    }
    }

    private void sairActionPerformed(ActionEvent evt){
    	if(evt.getSource() == sair){
    		System.exit(0);
    	}
    }
       
}
