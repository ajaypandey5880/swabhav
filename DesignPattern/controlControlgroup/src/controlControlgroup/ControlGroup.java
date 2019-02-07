package controlControlgroup;

import java.util.ArrayList;
import java.util.List;

import controlControlgroup.test.ControlControlGroupTest;

public class ControlGroup implements IControl {
	private String tag;
	private String text;

	private List<IControl> tagGroup = new ArrayList<IControl>();
	
	public ControlGroup(String tag) {
		this.tag=tag;
	}
	
	public ControlGroup(String tag,String text) {
		this(tag);
		this.text = text;
	}

	public String getTag() {
		return tag;
	}

	public List<IControl> getGroup() {
		return tagGroup;
	}
	public void addTag(IControl icontrol) {
		tagGroup.add(icontrol);
	}

	@Override
	public void displayDOM() {
		
		 System.out.println(ControlControlGroupTest.compositeBuilder +"<"+tag+">");
	        ControlControlGroupTest.compositeBuilder.append("  ");
	        for (IControl tag : tagGroup) {
	            tag.displayDOM();
	        }
	        ControlControlGroupTest.compositeBuilder.setLength(ControlControlGroupTest.compositeBuilder.length()-2);
	        System.out.println(ControlControlGroupTest.compositeBuilder +"</"+tag+">");
	}
}
