package homeassignment.day2;

import java.util.Iterator;

public class IsPrimeNum {
public static void main(String[] args) {
	
	System.out.println("prime Numbers are:");
	for (int n = 1; n <=50; n++) {
		boolean isPrime=true;
		for (int i = 2; i <=n/2; i++) {
			if (n%i == 0) {
				isPrime=false;
				break;	
			}
		}
		if (isPrime) {
			System.out.println(n);
			
		}
	}
}}