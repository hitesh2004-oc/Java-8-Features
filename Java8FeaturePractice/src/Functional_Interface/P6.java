package Functional_Interface;
import java.util.function.Function;

//Function - Functional Interface
/*Implements Function Using Lambda 
* Expression in Functional Interface
*/
public class P6 {
	
	public static void main(String[] args) {
		Function<String, String> upper = s -> s.toUpperCase();
		
		Function<String, Integer> f1 = s1 -> 
		s1.length() - s1.replaceAll(" ","").length();
		
		System.out.println(upper.apply("hitesh"));
		System.out.println(f1.apply("hitesh malviya"));
		
	}
}
