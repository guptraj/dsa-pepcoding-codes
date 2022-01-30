import java.util.Scanner;

public class array2 {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

    }

    public static int maxElement(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);

        }

        return maxi;
    }

    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);

        }

        return min;
    }

    public static int span(int[] arr) {
        int maxi = maxElement(arr);
        int min = minElement(arr);

        // int ans = maxi - min;
        return maxi - min;

    }

    public static void reverseArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = 0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int n = scn.nextInt();

        int[] arr = new int[n];

        takeInput(arr);
        // System.out.println(span(arr));
        // reverseArray(arr);
        // display(arr);

    }

}
