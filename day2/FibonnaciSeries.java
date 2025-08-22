package homeassignment.day2;

public class FibonnaciSeries {
public static void main(String[] args) {
	int n=8,firstnum=0,secnum=1;
	int nextnum;
	
	
	for (int i = 0; i <=n; i++) {
		System.out.print(firstnum+",");
		nextnum=firstnum+secnum;
		firstnum=secnum;
		secnum=nextnum;
		
	}
	
}
}
