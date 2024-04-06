package mükemmelSayi;

import java.util.Scanner;

public class mükemmelSayi {

	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayı girimiz :");
		int a = input.nextInt();
		
		
		int tambölüm = 0;
		
		for(int i = 1; i < a; i++ ) {
			if(a % i == 0) {
				tambölüm += i;
			}
		}
		
		if(tambölüm == a) {
		System.out.println( a +" sayısı bir mükemmel sayıdır");
		}	
		else {
			System.out.println( a  + " sayısı bir mükemmel sayı değildir");
		}
	}

}
