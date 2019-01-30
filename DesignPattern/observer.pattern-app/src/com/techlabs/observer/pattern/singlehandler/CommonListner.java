package com.techlabs.observer.pattern.singlehandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CommonListner implements MouseListener{
	private CommonListnerFrame frame;

	public CommonListner(CommonListnerFrame commonListnerFrame) {
		frame = commonListnerFrame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == frame.getButton()) {
			frame.getContainer().setBackground(Color.blue);
		}
		if(e.getSource() == frame.getButton1()) {
			frame.getContainer().setBackground(Color.red);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
