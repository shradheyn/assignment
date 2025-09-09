package assignment;

import java.util.*;
public class ITcity
{
	public static void main(String[] args) {
	    String city;
		System.out.println("enter a city name to check whether it is an IT city or not");
		Scanner sc= new Scanner(System.in);
		city=sc.next();
		String[] itCities = {"Delhi", "Mumbai", "Kolkata", "Bangalore", "Chennai", "Hyderabad"};

        boolean isIT = false;

        for (String c : itCities) {
            if (c.equalsIgnoreCase(city)) {
                isIT = true;
                break;
            }
        }

        if (isIT) {
            System.out.println("IT city");
        } else {
            System.out.println("Not an IT city");
        }
	}
}
