package StreamAPI;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

//Consumer..
//StreamAPI
//Stream-----DAM
//ForEach---------Consumer
public class P1 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		//Normal way to Iterate ArrayList
//		for(Integer x: num) {
//			System.out.println(x);
//		}
		
		//Using Stream and Consumer
		Stream<Integer> streamOfNum = num.stream();
		Consumer<Integer> c = i -> System.out.println(i);
		streamOfNum.forEach(c);
	}

}
