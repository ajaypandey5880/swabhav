package singleton.design.pattern;

public class SingletonDesignDemo {
	 private static final SingletonDesignDemo instance = new SingletonDesignDemo();
	    
	    //private constructor to avoid client applications to use constructor
	    private SingletonDesignDemo(){}

	    public static SingletonDesignDemo getInstance(){
	        return instance;
	    }
}
