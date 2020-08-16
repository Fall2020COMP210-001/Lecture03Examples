package lec3;

public class Example6 {
    public static void main(String[] args) {
        // Doing math with only integers always results
        // in an integer (i.e., any fractional part is lost
        int a = 8;
        int b = 7;
        int res = a/b; // res is now 1
        System.out.println("res = " + res);

        // If one of the values to an operand is real,
        // you'll get a real result.
        a = 10;
        double c = 3.5;
        double dres = a/c;
        System.out.println("dres = " + dres);

        // Be careful when mixing integer and reals
        // in an expression (especially with division)

        int num_right = 5;
        int num_questions = 8;
        double percentage = (num_right / num_questions) * 100.0;

        System.out.println("wrong percentage: " + percentage);

        percentage = ((num_right * 1.0) / num_questions) * 100.0;
        // Another way:
        // percentage = (((double) num_right) / num_questions) * 100.0;

        System.out.println("right percentage: " + percentage);

        // The ternary operator is very handy for
        // choosing between two different values
        // based on a boolean result

        int unc_score = 100;
        int duke_score = 80;

        String winner = (unc_score > duke_score) ? "Heels" : "Devils";
        System.out.println("The winner is " + winner);

        // Boolean operators will "short circuit"
        // once they know the answer.
        // First left side is evaluated.
        // Then right side is evaluated, but only if necessary.

        a = 10;
        b = -5;

        boolean bres = (a > 5) && checkIfPositive(b);
        System.out.println("bres = " + bres);

        // checkIfPositive below is never called because
        // right side was enough.

        bres = (a > 5) || checkIfPositive(b);
        System.out.println("bres = " + bres);
    }

    private static boolean checkIfPositive(int x) {
        System.out.println("Here I am in checkIfPositive");
        return (x > 0);
    }

}
