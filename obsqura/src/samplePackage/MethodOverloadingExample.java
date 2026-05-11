package samplePackage;


public class MethodOverloadingExample {

    // Method with 2 integer parameters
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Method with 3 integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // Method with double parameters
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        obj.add(10, 20);        // calls method with 2 int parameters
        obj.add(10, 20, 30);    // calls method with 3 int parameters
        obj.add(10.5, 20.5);    // calls method with double parameters
    }
}
