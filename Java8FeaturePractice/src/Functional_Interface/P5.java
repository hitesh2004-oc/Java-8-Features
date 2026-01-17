package Functional_Interface;
import java.util.function.Function;
import java.util.function.Supplier;

//Function - Functional Interface
/*Implements Function Without Using Lambda 
* Expression in Functional Interface
*/

//Supplier - [T.get();]

//Without Lamnbda[Implements Supplier]
class Sup implements Supplier<Double>{
	public Double get() {
		return Math.random();
	}
	
}
public class P5 implements Function<String, String>{

	public String apply(String s) {
		
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		Function<String, String> upper = new P5();
		System.out.println(upper.apply("hitesh"));
		
		//With Lamnbda[Implements Supplier]
		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());
		
		Supplier<Double> s = new Sup();
		System.out.println(s.get());
		
	}
}
