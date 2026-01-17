package Functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class P10 {
	public static void main(String[] args) {
		//...Implement Consumer With Lambda
		Consumer<Integer> con = a ->
		System.out.println(a);
		con.accept(10);
		
		//...Implement Bi-Consumer With Lambda
		BiConsumer<Integer,Integer> bic = (a,b) ->
		System.out.println(a+b);
		bic.accept(10,20);
	}

}
