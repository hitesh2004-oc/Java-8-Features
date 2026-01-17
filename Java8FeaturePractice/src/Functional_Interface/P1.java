package Functional_Interface;
import java.util.function.Predicate;
//Predicate - Functional Interface
/*Implements Predicate Without Using Lambda 
 * Expression in Functional Interface
 */
public class P1 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
	if(t>100) {
		return true;
	}else {
		return false;
	  }
	}
   public static void main(String[] args) {
	        Predicate<Integer> p = new P1();
	        
	        System.out.println(p.test(200));
	        System.out.println(p.test(100));
    }
}
