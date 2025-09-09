package assignment;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter hours of work per day: ");
        int hours = sc.nextInt();
        
        EmployySalary e = new EmployySalary(salary, hours);
        
        e.addSal();
        e.addWork();
        
        System.out.println("final salary: "+e.getFinalSalary());
	}
}
