import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {

	public Fenetre() {
		this.setTitle("IHM");
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		JPanel textPane = new JPanel();
		
		textPane.add(createTextZone("Coucou", 10), BorderLayout.NORTH);
		
		TextZone tz1 = new TextZone("Coucou", 10);
		textPane.add(tz1);
		
		add(textPane);
	}
	
	public JTextField createTextZone(String nameAction, int size){
		JTextField textField = new JTextField(size);
		textField.setActionCommand(nameAction);
		
		return textField;
	}
}
