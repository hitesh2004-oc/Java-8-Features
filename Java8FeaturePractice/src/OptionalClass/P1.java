package OptionalClass;

import java.util.Optional;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Enter ID");
		Scanner sc = new Scanner(System.in);
	    int id = sc.nextInt();		
		Optional<String> op= s.getID(id);
		
		
		if(op.isPresent()) {
			String s1 = op.get();
			s1 = s1.toUpperCase();
			System.out.println(s1);
		}else  System.out.println("Invalid ID");
			
	}

}
