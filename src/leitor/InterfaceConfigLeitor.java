package leitor;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import reporter.CliReporter;

public class InterfaceConfigLeitor extends JFrame {
    private JButton btConectar;
    private JButton btSair;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JTextField jtextNome;
    private JLabel labelBemvindo;
    private JLabel labelNome;
	private CliLeitor leitor;

	
	public InterfaceConfigLeitor(CliLeitor leitor){
		this.leitor = leitor;
		initComponents();
	}


	private void initComponents() {
	
	    jLabel1 = new JLabel();
	    jPanel1 = new JPanel();
	    labelBemvindo = new JLabel();
	    labelNome = new JLabel();
	    jtextNome = new JTextField();
	    btConectar = new JButton();
	    btSair = new JButton();
	
	    jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
	    jLabel1.setText("Bem Vindo à Central de Noticias");
	
	    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	    labelBemvindo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
	    labelBemvindo.setText("Bem Vindo à Central de Noticias");
	
	    labelNome.setText("Nome:");
	
	    btConectar.setText("Conectar");
	    btConectar.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            btConectarActionPerformed(evt);
	        }
	    });
	
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
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel1Layout.createSequentialGroup()
	                    .addGap(63, 63, 63)
	                    .addComponent(labelBemvindo))
	                .addGroup(jPanel1Layout.createSequentialGroup()
	                    .addGap(123, 123, 123)
	                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
	                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
	                            .addComponent(btConectar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(btSair, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(labelNome)
	                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jtextNome, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))))
	            .addContainerGap(70, Short.MAX_VALUE))
	    );
	    jPanel1Layout.setVerticalGroup(
	        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	            .addGap(20, 20, 20)
	            .addComponent(labelBemvindo)
	            .addGap(89, 89, 89)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(labelNome)
	                .addComponent(jtextNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
	            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                .addComponent(btSair)
	                .addComponent(btConectar))
	            .addGap(60, 60, 60))
	    );
	
	    GroupLayout layout = new GroupLayout(getContentPane());
	    getContentPane().setLayout(layout);
	    layout.setHorizontalGroup(
	        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    );
	    layout.setVerticalGroup(
	        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    );
	
	    pack();
	}// </editor-fold>      
	
	private void btConectarActionPerformed(java.awt.event.ActionEvent evt) {                                           

		try{
			leitor.setNome(jtextNome.getText());
			leitor.conectar();
		} catch(Exception e) {
			System.out.println("Servidor não encontrado.");
		}
	}                                          
	
	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
	    System.exit(NORMAL);
	}              
}