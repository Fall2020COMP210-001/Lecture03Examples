package lec3;

public class Example5NoImport {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        String next_line = scan.nextLine();

        while(!next_line.equals("quit")) {
            System.out.println(lec3Other.Magic8Ball.ask(next_line));
            next_line = scan.nextLine();
        }
    }
}
