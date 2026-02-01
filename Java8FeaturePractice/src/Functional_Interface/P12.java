package Functional_Interface;

import java.util.function.Predicate;

interface K{
	void Drive();
}

public class P12 implements Predicate<Integer> {
	public boolean test(Integer a) {
		if(a>100) {
			return true;
		}else return false;
	}
	
	public static void main(String[] args) {
		// Anonymous Inner class
		K a = new K() {
			public void Drive() {
				System.out.println("Drive......");
			}
		};
		a.Drive();
		Predicate<Integer> p = new P12();
		System.out.println(p.test(100));
		
		Predicate<Integer> p1 = i -> i>100;
		System.out.println(p1.test(200));
		
	}
}
