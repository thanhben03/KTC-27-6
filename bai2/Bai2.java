package bai2;

public class Bai2 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(checkOdd(a));
    }

    static boolean checkOdd(int a) {
        int b;
        boolean flag = true;
        while (a >= 10) {
            b = a % 10; // lay so cuoi cung
            if (b % 2 == 0) {
                return false;
            }
            a /= 10; // bo so cuoi cung
        }

        return a%2!=0 & flag;
    }
}
