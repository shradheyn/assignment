package assignment;

import java.util.Scanner;

public class Addresstest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Address[] students = new Address[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Year of Joining: ");
            int yoj = Integer.parseInt(sc.nextLine());

            System.out.print("Address: ");
            String addr = sc.nextLine();

            students[i] = new Address(name, yoj, addr);
        }

        System.out.println("Name   Year of joining   Address");

        for (Address s : students) {
            s.display();
        }

        sc.close();

	}
}
