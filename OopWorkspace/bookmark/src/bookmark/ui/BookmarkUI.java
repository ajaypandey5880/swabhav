package bookmark.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import bookmark.service.BookmarkService;

public class BookmarkUI {

	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		JFrame jFrame = new JFrame();
		JTextField url = new JTextField();
		JTextField name = new JTextField();
		JButton add = new JButton("Add URL");
		JButton display = new JButton("Display");
		
		
		
		ActionListener listener = new ActionListener() {
			BookmarkService service = new BookmarkService();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String action = e.getActionCommand();
				if(action.equals(add)) {
					try {
						service.add(url.getText(), name.getText());
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				//if(action.eq)
				
			}
		};
		add.addActionListener(listener);
		display.addActionListener(listener);
	}

}
