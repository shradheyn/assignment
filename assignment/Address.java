package assignment;

public class Address {
    String name;
    int yoj;      // year of joining
    String addr;  // address

    // Constructor
    Address(String name, int yoj, String addr) {
        this.name = name;
        this.yoj = yoj;
        this.addr = addr;
    }

    // Method to display student info
    void display() {
        System.out.println(name + "   " + yoj + "   " + addr);
    }
}

