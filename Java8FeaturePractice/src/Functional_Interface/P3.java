package Functional_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//Predicate WIth Collection FrameWork
public class P3 implements Predicate<Collection>{

	public boolean test(Collection t) {
	    if(t.isEmpty()) {
	    	return true;
	    }else {
	    	return false;
	    }
	}
    public static void main(String[] args) {
		Predicate<Collection> p = new P3();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		System.out.println(p.test(al));
	}
}
