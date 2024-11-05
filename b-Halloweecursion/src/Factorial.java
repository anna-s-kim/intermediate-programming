public class Factorial {
    // TASK 1: implement factorial recursively and iteratively
    public static void main(String[] args) throws Exception {
        // iterative and recursive factorial
        // 5! = 5 * 4 * 3 * 2 * 1
        // 5! = 5 * 4!
        // 4! = 4 * 3!
        // 3! = 3 * 2!
        // 2! = 2 * 1!
        // 1! = 1 * 0!
        // 0! = 1
        // iterative solution: 
        int n = 5;
        
        int factorial = 1; // starting value 
        for (int i = n; i > 0; i--) {
            // TODO: change 
        }
        System.out.println(factorial);
        // recursive solution:
        System.out.println(factorial(n));
        

    }

    private static int factorial(int n) {
        boolean BASE_CASE = false; // TODO: change this to be the base case
        if (BASE_CASE) {
            return 1;
        } else {
            return n; // TODO: change this to be the recursive case
        }
    }
}
