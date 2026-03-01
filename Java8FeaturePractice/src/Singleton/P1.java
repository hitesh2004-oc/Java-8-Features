package Singleton;

class Singleton{
	private static Singleton obj = null;
	private Singleton() {}
	public static Singleton getObj() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
}
public class P1 {
	public static void main(String[] args) {
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
	}
}
