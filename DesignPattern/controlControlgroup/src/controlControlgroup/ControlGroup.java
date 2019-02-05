package controlControlgroup;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IControl {
	private String tag;

	private List<IControl> tagGroup = new ArrayList<IControl>();
	
	public ControlGroup(String tag) {
		this.tag=tag;
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
		System.out.println("<"+tag+">");
		for (IControl element:tagGroup) {
			element.displayDOM();
		}
		System.out.println("</"+tag+">");
	}
}
