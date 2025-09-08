package homeassign.sep6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		//Intialize array string
		String[] ar= {"HCL", "Wipro", "AspireSystems", "CTS"};
		//String as List
		List<String> li=new ArrayList<>(Arrays.asList(ar));
		//Print the list
		System.out.println(li);
		// List in ascending order
		Collections.sort(li);
		//Iterate the values for reversing
		for (int i = li.size() - 1; i >= 0; i--) {
            System.out.print(li.get(i));
            //seperate value using ,
            if (i != 0) {  
                System.out.print(", ");
			}
		
		}

	}

}
