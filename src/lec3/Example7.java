package lec3;

public class Example7 {
    public static void main(String[] args) {

        double a = 0.1 + 0.1 + 0.1;
        double b = 0.3;

        if (a==b) {
            System.out.println("You might think this gets printed");
        } else {
            System.out.println("This is what gets printed instead");
        }

        // The specific value of an epsilon bound depends on what your program
        // is doing and how accurate it needs to be.
        // Also, "epsilon" is just a name, you can use whatever name you want
        // or a literal value. The concept is called an "epsilon" bound.

        double epsilon = 0.001;
        if (Math.abs((a-b)) < epsilon) {
            System.out.println("Close enough");
        } else {
            System.out.println("Not close enough");
        }
    }
}
