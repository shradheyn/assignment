package assignment;

import java.util.*;
public class BMI
{
	public static void main(String[] args) {
		double wt,height;
		System.out.print("enter you weight and height");
		Scanner sc=new Scanner(System.in);
		wt=sc.nextDouble();
		height=sc.nextDouble();
		double bmi=wt/(height*height);
		System.out.printf("you bmi is: %.2f ",bmi);
	}
}
