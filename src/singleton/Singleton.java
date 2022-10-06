package singleton;

public class Singleton {
	
	A obj1 = A.getInstance();
	A obj2 = A.getInstance();
}

class A {
	static A obj = new A();
	private A() {
	}
	public static A getInstance() {
		return obj;
	}
}
