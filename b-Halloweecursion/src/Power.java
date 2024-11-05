public class Power {
    int power(int i, int n){ 
        if (n == 0) {
            return 1;
        } else {
            return i * power(i, n - 1);
        }
    }
}
