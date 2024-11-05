import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        String[] gifts = {
                "skeleton",
                "haunted houses",
                "randy's",
                "witches",
                "kit kats",
                "hershey kisses",
                "bats"
        };
        Halloween hw = new Halloween(gifts);
        hw.singSong();

        // // uncomment for bonus task below
        // String s = "new string";
        // String m = replace(s, 0); // recursive
        // // String m = replaceIterative(s);
        // System.out.println(m);

        Power x = new Power();
        System.out.println(x.power(3, 4));

    }

    // BONUS TASK: fix the bug!
    // iterative - with a bug
    public static String replaceIterative(String s) {
        for (int i = 0; i < s.length(); i++) {
            char replaced = s.charAt(i);
            System.out.println("hi" + i);
            replaced += 1; // encode a string, shift it 1 char
            s = s.substring(0, i) + replaced + s.substring(i, s.length());
        }
        return s;
    }

    // recursive - with a bug
    public static String replace(String s, int i) {
        if (i == s.length()) {
            return s; // all done!
        } else {
            char replaced = s.charAt(i);
            replaced += 1;
            s = s.substring(0, i) + replaced + s.substring(i, s.length());
            return replace(s, i + 1);
        }
    }
}
