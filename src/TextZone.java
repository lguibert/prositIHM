import javax.swing.JTextField;


@SuppressWarnings("serial")
public class TextZone extends JTextField {

	public TextZone(String nameAction, int size){
		super(size);
		this.setActionCommand(nameAction);
	}
}
