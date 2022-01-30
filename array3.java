import java.util.Scanner;

public class array3 {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInputA(int[] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = scn.nextInt();

        }

    }

    public static void takeInputB(int[] arrB) {
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = scn.nextInt();

        }

    }

    public static void arraySum(int[] arrA, int[] arrB, int[] arrC) {

        int k = arrC.length - 1;
        int i = arrA.length - 1;
        int j = arrB.length - 1;
        int c = 0;

        while (k >= 0) {
            int sum = 0;
            sum += c;

            if (i >= 0) {
                sum += arrA[i];
            }

            if (j >= 0) {
                sum += arrB[j];
            }

            arrC[k] = sum % 10;
            c = sum / 10;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.println(c);
        }
        for (int ele : arrC) {
            System.out.println(ele);
        }

    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int[] arrA = new int[n1];
        takeInputA(arrA);

        int n2 = scn.nextInt();
        int[] arrB = new int[n2];
        takeInputB(arrB);

        // int size = (n1 > n2) ? n1 : n2;
        // int[] arrC = new int[size]; for sum of arrays

    }
}
