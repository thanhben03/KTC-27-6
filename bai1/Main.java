package bai1;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,0,3,0,5,0,6};

        int[] newArray = lastArrayZero(a);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }

    static int[] lastArrayZero(int[] a) {
        int[] temp = new int[a.length];
        int last = a.length - 1;
        int first = 0;
        for (int j : a) {
            if (j != 0) {
                temp[first] = j;
                first++;
            } else {
                temp[last] = j;
                last--;
            }
        }

        return temp;
    }
}
