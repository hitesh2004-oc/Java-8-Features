package Functional_Interface;
import java.util.function.Predicate;

//.....Functional Interface.....//
/*Using Predicate Joining :-
 * Multiple Predicate like Default
 * or, and , negate[Reverse]
 */
//Check Predicate Appraoch
//Using Lambda Expression
public class P4 {
    public static void checkPredicate(Predicate<Integer> p,int[] arr) {
    	for(int i = 0;i<arr.length;i++) {
    		if(p.test(arr[i])) {
    			System.out.print(arr[i]+" ");
    		}
    	}
    	System.out.println();
    }
    public static void main(String[] args) {
		int num[] = {10,29,-20,30,41,-10,91,100};
		
		Predicate<Integer> p1 = i ->(i < 50); //Less Than 50
		Predicate<Integer> p2 = i ->i%2 == 0; //Even Numbers
		Predicate<Integer> p3 = i ->i%2 != 0; //Odd Numbers
		Predicate<Integer> p4 = p2.negate(); // Reverse the Method
		Predicate<Integer> p5 = p1.and(p2); // Check Two Condition
		
		checkPredicate(p1, num);
		checkPredicate(p2, num);
		checkPredicate(p3, num);
		checkPredicate(p4, num);
		checkPredicate(p5, num);
	}
}
