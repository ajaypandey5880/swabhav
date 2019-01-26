package singleton.design.pattern.test;

import singleton.design.pattern.SingletonDesignDemo;

public class SingletonTest {

	public static void main(String[] args) {
		//SingletonDesignDemo demo = new SingletonDesignDemo(); //cannot create a new object
		SingletonDesignDemo demo = SingletonDesignDemo.getInstance(); // single object available
	}
}
