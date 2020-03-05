package etoiles;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon image = new ImageIcon("images/middle.gif");
		//JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		JOptionPane.showMessageDialog(null, "Hamdoullah", "Salut ca va?",JOptionPane.INFORMATION_MESSAGE, image);
		System.exit(0);

	}

}
