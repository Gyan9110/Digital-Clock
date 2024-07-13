package firstJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Window extends JFrame {
	private JLabel heading;
	private JLabel clockLabel;
	private Font font = new Font("", Font.BOLD, 35);
	
	Window() {
		super.setTitle("My Clock");
		super.setSize(400,400); //width,height
		super.setLocation(300, 50);
		this.createGui();
		this.startClock();
		super.setVisible(true);
	}
	public void createGui() {
		heading = new JLabel("My Clock");
		clockLabel = new JLabel("Clock");
		heading.setFont(font);
		clockLabel.setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockLabel);
	}
	public void startClock() {
		Timer timer = new Timer(1000, (ActionListener) new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				String dateTime = new Date().toString();
				clockLabel.setText(dateTime);
			}
		});
		timer.start();
	}
}
