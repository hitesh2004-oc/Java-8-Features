package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class P2 {
	public static void main(String[] args) {
	  ArrayList<Integer> num = new ArrayList<>();
	  num.add(10);
      num.add(20);
	  num.add(30);
	  num.add(40);
	  
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
	  
			  
	
	
	
	}

}
