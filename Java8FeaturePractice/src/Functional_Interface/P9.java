package Functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer - [void accept(T t)]
//Bi-Consumer - [void accept(T t,U u)]

//...Implement Consumer Without Lambda
class C implements Consumer<Integer>{
	public void accept(Integer a) {
		a = a+10;
		System.out.println(a);
	}
}

//...Implement Bi-Consumer Without Lambda
class D implements BiConsumer<Integer, Integer>{
	public void accept(Integer a, Integer b) {
		System.out.println(a+b);
	}
}
public class P9 {
	public static void main(String[] args) {
		Consumer<Integer> con = new C();
		con.accept(10);
		
		BiConsumer<Integer,Integer> bic = new D();
		bic.accept(10,20);
	}

}
