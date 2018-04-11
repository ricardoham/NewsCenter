package comum;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Modal_Logo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	 public void paint(Graphics g)
	    {
	        super.paint(g);
	        Graphics2D auxGraphics = (Graphics2D)g;
	        try
	        {
	        	ImageIcon img = new ImageIcon("logo.jpg");
	        	Image auxImage = img.getImage();
	            
	            auxGraphics.drawImage(auxImage, 10, 30, 195, 195, 0, 0, auxImage.getWidth(null), auxImage.getHeight(null), null);
	        }
	        catch(Exception e)
	        {
	            System.out.println("Ocorreu um erro ao carregar o logo");
	        }
	    }

}
