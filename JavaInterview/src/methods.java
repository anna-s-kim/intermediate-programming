public class methods {
    public static void main(String[] args) throws Exception {
        System.out.println(isPositive(1));
        System.out.println(findLeast(1, 2, 3));
        System.out.println(triangle(3));
        System.out.println(shareLastDigit(11, 12));
        System.out.println(sumDigits(321));
        System.out.println(toDecimal(101));
    }

    static boolean isPositive(int x) {
        if(x > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    static int findLeast(int x, int y, int z) {
        if(x < y && x < z) {
            return x;
        }
        else if(y < x && y< z) {
            return y;
        }
        else {
            return z;
        }
    }

    static double triangle(int x) {
            return x * x/2.0;
        }

        
  static boolean shareLastDigit(int x, int y) {
    if(x%y == 0) {
        return true;
    }
    else {
        return false;
    }
  }   
  
  static int sumDigits(int x) {
    return Integer.toString(x);
  }   
  static double todecimal(int x) {
    read(x);
  }   
 }
