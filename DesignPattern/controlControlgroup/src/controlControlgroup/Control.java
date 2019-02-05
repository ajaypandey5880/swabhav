package controlControlgroup;

public class Control implements IControl {
	private String tag;
	private String type;

	public Control(String input) {
		this.tag = input;
	}
	
	public Control(String input ,String type) {
		this(input);
		this.type = type;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTagName() {
		return tag;
	}

	public void setTagName(String tag) {
		this.tag = tag;
	}

	@Override
	public void displayDOM() {
		System.out.println("<" + tag + ">< input type ="+this.type);
		System.out.println("</" + tag + ">");
	}
}
