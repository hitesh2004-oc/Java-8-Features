package Functional_Interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class P8 {
	public static void main(String[] args) {
	//...Implement Bi-Predicate With Lambda
	BiPredicate<Integer, Integer> bip = (a,b) ->a+b>10;
	System.out.println(bip.test(10, -5));
	
	//...Implement Predicate With Lambda
	Predicate<Integer> p = a -> a>50;
	System.out.println(p.test(20));
	}
}
