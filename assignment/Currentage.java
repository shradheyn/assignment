package assignment;


import java.util.*;
public class Currentage
{
	public static void main(String[] args) {
	    int year=0;
	    Scanner sc= new Scanner(System.in);
		System.out.println("enter your year of birth");
		year=sc.nextInt();
		int ans=2024-year;
		System.out.println("your age is: "+ans);
	}
}
