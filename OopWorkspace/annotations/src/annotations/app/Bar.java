package annotations.app;

public class Bar {
	@ProTestCase
	public boolean m1() {
		return true;
	}

	@ProTestCase
	public boolean m2() {
		return false;
	}

	public boolean m3() {
		return true;
	}

	@ProTestCase
	public boolean m4() {
		return false;
	}
}
