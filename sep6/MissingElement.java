package homeassign.sep6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElement {
public static void main(String[] args) {
	Integer[] ar= {1, 2, 3, 4, 10, 6, 8};
	List<Integer> li=new ArrayList<>(Arrays.asList(ar));
	 Collections.sort(li);
	 System.out.println("SORTED LIST:" +li);
	 for (int i = 0; i < li.size()-1; i++) {
		 int num=li.get(i);
		 int num1=li.get(i+1);
		 if(num!=num1) {
			 for (int j = num+1; j < num1; j++) {
				 System.out.println(j);
				
			}
		 }
		
	}
}
}
