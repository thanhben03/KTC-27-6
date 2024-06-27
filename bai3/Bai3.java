package bai3;

public class Bai3 {
    public static void main(String[] args) {
        int a = -1234;  

        while (a >= 10 || -a >= 10) {
            a /= 10;
        }

        System.out.println(a);
    }
}
