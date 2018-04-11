package comum;

import java.awt.Color;
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



public class Modal_Help extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel background = new JPanel();	
	private final JTextArea text = new JTextArea();
	private final JButton buttonClose = new JButton("Fechar");	
	private final JPanel button = new JPanel();
    private Modal_Info dados;
    
    public Modal_Help(JFrame sup, String title) throws HeadlessException {    	
    	super(sup, title);
    	
      
    	
		buttonClose.addActionListener(this);
		button.add(buttonClose);
		add(button, "South");
		
		  setDefaultCloseOperation(2);
	      setSize(800, 320);
	      setResizable(false);
		
        background.setBorder(new TitledBorder(new LineBorder(Color.gray), "Central de Noticías - Versao 6.6.2"));
        background.setBackground(Color.white);
        
        text.setPreferredSize(new Dimension(830, 260));
        text.setBackground(Color.white);
        text.setEditable(false);
        text.setFont(new Font("Century Gothic", 1, 11));
        text.setText(Modal_Info.getAjuda());

        background.add(text);
        add(background, "Center");
    }

	public void actionPerformed(ActionEvent evento)
    {
        setVisible(false);
    }
	
}
