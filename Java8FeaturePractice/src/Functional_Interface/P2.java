package Functional_Interface;
import java.util.function.Predicate;

//Predicate - Functional Interface
/*Implements Predicate Using Lambda 
* Expression in Functional Interface
*/
public class P2 {
	public static void main(String[] args) {
//		Predicate<Integer> p = (t) -> {
//			if(t>100) {
//				return true;
//			}else {
//				return false;
//			}
//		};
		//Best Approach of Lambda Expression
		Predicate<Integer> p = t -> t>100;
		Predicate<String> p1 = t -> t.length()>100;
		System.out.println(p.test(200));
		System.out.println(p1.test("hitesh"));
	}

}
