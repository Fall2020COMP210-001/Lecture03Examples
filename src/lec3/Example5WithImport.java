package lec3;

import java.util.Scanner;
import lec3Other.Magic8Ball;

public class Example5WithImport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String next_line = scan.nextLine();

        while(!next_line.equals("quit")) {
            System.out.println(Magic8Ball.ask(next_line));
            next_line = scan.nextLine();
        }
    }
}
