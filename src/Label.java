import javax.swing.JLabel;

public class Label extends JLabel {
	public Label(String description, String name) {
		super(description);
		this.setLabelFor(name);
	}
}
