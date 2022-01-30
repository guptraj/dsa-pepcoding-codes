import java.util.Scanner;

public class array1 {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int findElement(int[] arr, int num) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }

        return index;

    }

    public static int maxiElement(int[] arr) {
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        return maxi;

    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        // int num = scn.nextInt();

        takeInput(arr);
        // printArray(arr);
        // System.out.println(findElement(arr, num));
        // System.out.println(maxiElement(arr));
        // System.out.println(minElement(arr));

    }
}
