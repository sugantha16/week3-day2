package week3;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<String> al=new ArrayList<String>();
 al.add("selvam");
 al.add("Priya");
 al.add("Devi");
 al.add("Lechu");
 
 Collections.sort(al);
 System.out.println("List after the use of" + " Collection.sort() :\n" + al);
 
 
	
	}

}
