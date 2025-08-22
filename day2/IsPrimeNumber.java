package homeassignment.day2;

public class IsPrimeNumber {
public static void main(String[] args) {
	int num=53;// intialize the num
	boolean isprime=true;// intialize is prime true always
	if(num<=1) {    //if given number is less than or equal to 1
		isprime=false;
		System.out.println("not a prime");
	}
	else {
	for (int i = 2; i <=num-1; i++) {
		if(num%i==0) {
			isprime=false;
			break;
		}
			}
	
}
	if(isprime) {
		System.out.println(num+"is prime");
	}
	else {
		System.out.println(num+"is not prime");
	}
}
}