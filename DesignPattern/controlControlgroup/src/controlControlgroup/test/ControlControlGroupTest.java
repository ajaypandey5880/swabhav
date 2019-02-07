package controlControlgroup.test;

import controlControlgroup.Control;
import controlControlgroup.ControlGroup;

public class ControlControlGroupTest {
	
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		ControlGroup divroot = new ControlGroup("div");
		ControlGroup par = new ControlGroup("p","Enter Name");
		Control enterName = new Control("input","text");
		divroot.addTag(par);
		par.addTag(enterName);
		divroot.displayDOM();
	}
}
