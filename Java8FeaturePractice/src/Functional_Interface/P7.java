package Functional_Interface;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
//Predicate - [boolean test(T t)]
//Bi-Predicate - [boolean test(T t, U u)]

//...Implement Predicate Without Lambda
class A implements Predicate<Integer>{
	public boolean test(Integer a) {
	    if(a > 50) {
	    	  return true;
	    }
		return false;
	}
}

//...Implement Bi-Predicate Without Lambda
class B implements BiPredicate<String, String>{
	  @Override
		public boolean test(String a, String b) {
			if(a.equals(b)) {
				return true;
			}
			return false;
		}
}

public class P7 {
	public static void main(String[] args) {
		BiPredicate<String, String> bip = new B();
		System.out.println(bip.test("hitesh","hitesh"));
	
	    Predicate<Integer> p = new A();
	    System.out.println(p.test(20));
	}

}
