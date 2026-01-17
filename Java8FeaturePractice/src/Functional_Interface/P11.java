package Functional_Interface;
import java.util.function.BiFunction;
import java.util.function.Function;

//Function - [public R apply(T t)]
//Bi-Function -[public R apply(T t,U u)] 

//...Implement Function Without Lambda
class E implements Function<String, String>{
	public String apply(String s) {	
		return s.toUpperCase();
	}
}

//...Implement Bi-Function Without Lambda
class F implements BiFunction<String, String, Integer>{
	public Integer apply(String a,String b) {
		return a.length() + b.length();
	}
}
public class P11{
	public static void main(String[] args) {
		//second is Return type
		Function<String, String> f = new E();
		System.out.println(f.apply("hitesh"));
		
		BiFunction<String, String,Integer> bif = new F();
		System.out.println(bif.apply("Hitesh","Malviya"));
		
	}
}
