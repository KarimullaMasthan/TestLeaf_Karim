package testleaf.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		
		String[] a = {"aa", "bb"};
		List list = new ArrayList ();
		
		list.add("Karim");
		list.add("Bharathan");
		list.add("Babu");
//		Collections.sort(list);
//		Collections.shuffle(list);
//		list.sort((Comparator) list);
		Collections.emptyList().addAll(list);
		 for(int i=0; i<list.size(); i++){
			 System.out.println(list.get(i));
		 }
		 
		
	}

}
