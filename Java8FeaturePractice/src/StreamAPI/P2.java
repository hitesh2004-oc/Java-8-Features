package StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class P2 {
	public static void main(String[] args) {
	  ArrayList<Integer> num = new ArrayList<>();
	  num.add(1);
      num.add(2);
	  num.add(3);
	  num.add(4);
	  
	  //Stream API[Sequential Stream]
	  //Stream()
	  Stream<Integer> Snum = num.stream();
	  
	  //Iterated Stream Using ForEach
	  //Stream are Traverse only once 
	  
	  //One time[Successfull]
	  Snum.forEach(i -> System.out.println(i));
	  
/* After Traverse the Pipline automatically Close
 * all Elements are already Traverse pipline to 
 * Sequential Stream	 */

	  //Second time[IllegalStateException]
	  //Snum.forEach(i -> System.out.println(i));
	  
      // Using Filter()  
	  // Predicate<Integer> p = i -> i%2==0;
	  num.stream().filter(i -> i%2 == 0 /*or p*/ ).
	  forEach(j -> System.out.println(j));
	  
	  // Using Map()  
	  // Function<Integer, Integer> f = a -> a*a ;
	  num.stream().filter(i -> i%2 == 0).
	  map(/*f* or*/a-> a*a).forEach(j -> System.out.println(j));
	  
	  List<String> name = Arrays.asList("hitesh","harsh","vinod","mohit");
	  
	  // Print name Startwith h //
	  Stream<String> n = name.stream();
	  n.filter(i -> i.startsWith("h")).map(f -> f.toUpperCase()).
	  forEach(e -> System.out.println(e));
	  
	  // Print name Not Startwith h //
	  name.stream().filter(i ->! i.startsWith("h")).map(f -> f.toUpperCase()).
	  forEach(e -> System.out.println(e));  

	  // Use of Limit method
	  num.stream().limit(3).forEach(e -> System.out.println(e));  
	}
}
