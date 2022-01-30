import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();
        // int z = scn.nextInt();
        // int y = scn.nextInt();

        // for (int i = z; i <= y; i++) {
        // // int n = scn.nextInt();

        // boolean x = false;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // // system.out.println("notprime");
        // x = true;
        // break;
        // // break-to terminate the loop
        // // continue- to skip that iteration
        // }
        // }
        // if (x == false) {

        // System.out.println(i);
        // }
        // }

        // 0 1 1 2 3 5 8 13 n-n-1+n-2

        int n = scn.nextInt();
        int first = 0;
        int second = 1;
        // int i = 3;
        int third = 0;

        // System.out.print(first + " ");
        // System.out.print(second + " ");

        // while (i <= n) {
        // third = first + second;
        // first = second;
        // second = third;
        // i++;

        // }
        // System.out.print(third + " ");

        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;

        }
        System.out.print(third);

    }
}
