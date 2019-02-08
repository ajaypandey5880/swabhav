package asynchronous;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Asynchronous extends JFrame {
	private Container container;
	private JButton hello, display;

	public Asynchronous() {
		init();
	}

	public void init() {
		container = getContentPane();
		hello = new JButton("Hello");
		display = new JButton("Display");

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Hello Clicked");
			}
		};

		ActionListener actionListener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t1 = new Thread(new Display());
				t1.start();
			}
		};

		hello.addActionListener(actionListener);
		display.addActionListener(actionListener1);

		hello.setBounds(50, 100, 100, 30);
		display.setBounds(200, 100, 100, 30);

		container.add(hello);
		container.add(display);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] agrs) {
		Asynchronous synchronous = new Asynchronous();
	}

}
