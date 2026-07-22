package Recusrion;

public class Task1_1 {
    //S(n)=1-2+3-4+...+ ((-1)^(n+1) ).n , n>0
    public static int getSn1(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        } else if (n == 1) {
            return 1;
        } else {
            return getSn1(n - 1) + (int) Math.pow(-1, n + 1) * n;
        }
    }

    //S(n)=1+1.2+1.2.3+...+1.2.3...n, n>0
    public static int getSn2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        } else if (n == 1) {
            return 1;
        } else {
            return getSn2(n - 1) + factorial(n);
        }

    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    //S(n)=1^2+2^2+3^2+....+n^2 n, n>0
    public static int getSn3(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        } else if (n == 1) {
            return 1;
        } else {
            return getSn3(n - 1) + (int) Math.pow(n , 2);
        }
    }

    //S(n)=1+1/2+1/(2.4)+1/(2.4.6)+...+1/(2.4.6.2n), n>0
    public static int getSn4(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input");
        } else if (n == 0) {
            return 1;
        } else {
            return getSn4(n - 1) + (1 / getF(n));
        }
    }

    private static int getF(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        } else if (n == 1) {
            return 2;
        } else {
            return getF(n - 1) * 2 * n;
        }
    }

    //Test cases
    static void main(String[] args) {
        int n = 12;

//        System.out.println(getSn1(n));
//        System.out.println(getSn2(n));
//        System.out.println(getSn3(n));
        System.out.println(getSn4(n));
    }
}
