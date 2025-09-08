package homeassign.sep6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;



public class InterSectionList {
	public static void main(String[] args) {
		
	
	Integer[] ar= {3, 2, 11, 4, 6, 7};
	Integer[] ar1= {1, 2, 8, 4, 9, 7};
	
	
List<Integer> li=new ArrayList<>(Arrays.asList(ar));
List<Integer> lis=new ArrayList<>(Arrays.asList(ar1));

for(int i=0; i<li.size();i++)                 
{
	int num=li.get(i);

for (int j = 0; j <lis.size(); j++) {
	
	int num1=lis.get(j);

if(num==num1)
{
	System.out.println("Intersection number:"+num);
}

}
}
}
}