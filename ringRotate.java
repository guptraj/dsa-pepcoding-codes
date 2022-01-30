import java.util.Scanner;

public class ringRotate {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

    }
    
    public static void rr(int [][] A) {
        
    }
    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        takeInput(A);
        rr(A);

    }
    
}
