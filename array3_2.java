import java.util.Scanner;

public class array3_2 {

    public static Scanner scn = new Scanner(System.in);

    public static int[] difference(int[] A, int[] B) {
        int[] ans = new int[B.length];

        int i = A.length - 1;
        int j = B.length - 1;
        int k = ans.length - 1;
        int borrow = 0;

        while (j >= 0) {
            int digit = B[j] + borrow;

            if (i >= 0) {
                digit -= A[i];

            }

            if (digit < 0) {
                digit += 10;
                borrow = -1;
            }

            ans[k] = digit;

            i--;
            j--;
            k--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = scn.nextInt();
        }

        int[] ans = difference(A, B);

        int fnzi = -1;

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0) {
                fnzi = i;
                break;
            }
        }

        if (fnzi == -1) {
            System.out.println("0");
            return;
        }

        for (int i = fnzi; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
