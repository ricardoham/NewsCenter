package comum;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Modal_About extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel background = new JPanel();	
	private final JTextArea text = new JTextArea();
	private final JButton buttonClose = new JButton("Fechar");	
	private final JPanel button = new JPanel();
	private final JPanel logo = new Modal_Logo();
	
	public Modal_About(JFrame sup, String title) throws HeadlessException{
		
		super(sup, title);
		buttonClose.addActionListener(this);
		button.add(buttonClose);
		add(button, "South");
		
        setDefaultCloseOperation(2);
        setSize(800, 320);
        setResizable(false);
        
        text.setBackground(Color.white);
        background.setBackground(Color.white);
        
        text.setPreferredSize(new Dimension(500, 200));
        text.setFont(new Font("Century Gothic", 4, 14));
        text.setEditable(false);
        text.setText(Modal_Info.getDados());
        
        background.setBorder(new TitledBorder(new LineBorder(Color.black), "Projeto II - Liguagem Tecnica e Programacao III"));
        logo.setBorder(new TitledBorder(new LineBorder(Color.black),"UNICAMP"));
        
        
        
        background.add(text);
        add(background, "Center");
        
        logo.setPreferredSize(new Dimension(200, 220));
        logo.setBackground(Color.white);
        add(logo, "West");
	}
	
	   public void actionPerformed(ActionEvent evento)
	    {
	        setVisible(false);
	    }


}
