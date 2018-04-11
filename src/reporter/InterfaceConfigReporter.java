package reporter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class InterfaceConfigReporter extends JFrame {
    private JButton btConectar;
    private JButton btConectarPadrao;
    private JButton btSair;
    private JPanel jPanel1;
    private JTextField jtextHost;
    private JTextField jtextNome;
    private JTextField jtextPorta;
    private JLabel labelBemvindo;
    private JLabel labelConectarPadrão;
    private JLabel labelHost;
    private JLabel labelNome;
    private JLabel labelPorta;
	private CliReporter reporter;

	public InterfaceConfigReporter(CliReporter reporter) {        
	    this.reporter = reporter;
	    
	    initComponents();
	}
	
	private void initComponents() {
	
	    jPanel1 = new JPanel();
	    labelBemvindo = new JLabel();
	    labelNome = new JLabel();
	    jtextNome = new JTextField();
	    labelHost = new JLabel();
	    jtextHost = new JTextField();
	    jtextHost.setText("localhost");
	    btConectar = new JButton();
	    btSair = new JButton();
	    btConectarPadrao = new JButton();
	    labelConectarPadrão = new JLabel();
	    labelPorta = new JLabel();
	    jtextPorta = new JTextField();
	    jtextPorta.setText("2222");
	
	    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	    labelBemvindo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
	    labelBemvindo.setText("Bem Vindo à Central de Noticias");
	
	    labelNome.setText("Nome:");
	
	    labelHost.setText("Host:");
	
	    btConectar.setText("Conectar");	
	    btConectar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	            btConectarActionPerformed(evt);
	        }
	    });
	
	    btConectarPadrao.setText("Conectar Padrão");
	
	    labelConectarPadrão.setText("Conectar Usando Configuração Padrão:");
	
	    labelPorta.setText("Porta:");

	    btSair.setText("Sair");
	    btSair.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            btSairActionPerformed(evt);
	        }
	    });
	
	    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
	    jPanel1.setLayout(jPanel1Layout);
	    jPanel1Layout.setHorizontalGroup(
	        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
	                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(64, 64, 64)
	                        .addComponent(labelBemvindo))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(57, 57, 57)
	                        .addComponent(labelConectarPadrão)
	                        .addGap(18, 18, 18)
	                        .addComponent(btConectarPadrao))
	                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(btConectar)
	                        .addGap(41, 41, 41)
	                        .addComponent(btSair, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
	                        .addGap(53, 53, 53)))
	                .addGroup(jPanel1Layout.createSequentialGroup()
	                    .addContainerGap()
	                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(labelHost)
	                                .addGap(5, 5, 5))
	                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                .addComponent(labelNome)
	                                .addGap(14, 14, 14)))
	                        .addComponent(labelPorta))
	                    .addGap(36, 36, 36)
	                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                        .addComponent(jtextPorta, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jtextHost, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jtextNome, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
	                    .addGap(27, 27, 27)))
	            .addGap(40, 69, Short.MAX_VALUE))
	    );
	    jPanel1Layout.setVerticalGroup(
	        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	            .addGap(20, 20, 20)
	            .addComponent(labelBemvindo)
	            .addGap(35, 35, 35)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(jtextNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addComponent(labelNome))
	            .addGap(21, 21, 21)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(labelHost)
	                .addComponent(jtextHost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	            .addGap(18, 18, 18)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(labelPorta)
	                .addComponent(jtextPorta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	            .addGap(18, 18, 18)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(btConectar)
	                .addComponent(btSair))
	            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(labelConectarPadrão)
	                .addComponent(btConectarPadrao))
	            .addGap(17, 17, 17))
	    );
	
	    GroupLayout layout = new GroupLayout(getContentPane());
	    getContentPane().setLayout(layout);
	    layout.setHorizontalGroup(
	        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    );
	    layout.setVerticalGroup(
	        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    );
	
	    pack();
	}// </editor-fold>                
	
	
	private void btConectarActionPerformed(ActionEvent evt)
	{
		try{
			reporter.setNome(jtextNome.getText());
		    reporter.conectar(Integer.parseInt(jtextPorta.getText()), jtextHost.getText());
		} catch(Exception e) {
			System.out.println("Servidor não encontrado.");
		}
	}                                                
	
	private void btSairActionPerformed(ActionEvent evt) {                                           
		System.exit(NORMAL);
	}           

}