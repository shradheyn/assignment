package assignment;

import java.util.*;
public class Oddeven
{
	public static void main(String[] args) {
	    int n;
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0) System.out.println("the number is even");
		else System.out.println("the number is odd");
	}
}
