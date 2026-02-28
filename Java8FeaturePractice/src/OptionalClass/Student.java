package OptionalClass;

import java.util.Optional;

public class Student {
	public Optional<String> getID(int id){
		if(id == 101) return Optional.ofNullable("hitesh");
		if(id == 102) return Optional.ofNullable("vinod");
		if(id == 103) return Optional.ofNullable("rohit");
		if(id == 104) return Optional.ofNullable("rahul");
		if(id == 105) return Optional.ofNullable("harsh");
		return Optional.ofNullable(null);
		
	}

}
