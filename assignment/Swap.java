package assignment;

public class Swap
{
	public static void main(String[] args) {
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("the swapped values of a and b are: "+a+" and "+b);
	}
}
