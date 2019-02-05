package bookmark.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bookmark.service.BookmarkService;

public class BookmarkUI {

	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		JFrame jFrame = new JFrame();
		JLabel label = new JLabel("Enter Name ");
		JLabel label1 = new JLabel("Enter Url");
		JTextField url = new JTextField();
		JTextField name = new JTextField();
		JButton add = new JButton("Add URL");
		JButton display = new JButton("Display");
		
		
		
		ActionListener listener = new ActionListener() {
			BookmarkService service = new BookmarkService();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("entered");
				String action = e.getActionCommand();
				if(action.equals("Add URL")) {
					//System.out.println("ENtered");
					System.out.println(url.getText()+""+name.getText());

					try {
						service.add(url.getText(), name.getText());
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				if(action.equals("Display")) {
					
				}
				
			}
		};
		
		add.addActionListener(listener);
		display.addActionListener(listener);
		
		jFrame.setLayout(null);
		label.setBounds(80, 70, 250, 30);
		name.setBounds(200, 70, 270, 30);
		label1.setBounds(80, 100, 100, 50);
		url.setBounds(200, 120,270, 30);
		add.setBounds(200, 160, 100, 30);
		display.setBounds(350, 160, 100, 30);
		
		
		jFrame.setSize(500	, 500);
		jFrame.add(url);
		jFrame.add(name);
		jFrame.add(add);
		jFrame.add(display);
		jFrame.add(label);
		jFrame.add(label1);
		jFrame.setVisible(true);
	}

}
