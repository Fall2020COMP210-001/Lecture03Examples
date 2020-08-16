package lec3;

public class Example4 {
    public static void main(String[] args) {
        String s1 = "A String";
        String s2 = "A String";
        String s3 = "A " + "Str" + "ing";
        String s4 = new String("A String");
        String s5 = "a".toUpperCase() + " String";
        String s6 = "This is A String, true?".substring(8, 16);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
        System.out.println("s6: " + s6);

        System.out.println("s1.equals(s2) is " + s1.equals(s2));
        System.out.println("s1.equals(s3) is " + s1.equals(s3));
        System.out.println("s1.equals(s4) is " + s1.equals(s4));
        System.out.println("s1.equals(s5) is " + s1.equals(s5));
        System.out.println("s1.equals(s6) is " + s1.equals(s6));

        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));
        System.out.println("s1 == s4 is " + (s1 == s4));
        System.out.println("s1 == s5 is " + (s1 == s5));
        System.out.println("s1 == s6 is " + (s1 == s6));

    }
}
