import java.util.Scanner;

public class array4 {
    public static Scanner scn = new Scanner(System.in);

    public static void reverse(int[] arr, int i, int e) {
        while (i <= e) {
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;

            i++;
            e--;
        }

    }

    public static int[] rotate(int[] arr, int k) {

        int n = arr.length;

        if (k >= 0) {
            k = k % n;

        } else {
            k = k % n;
            k += n;

        }

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;

    }

    public static int[] inverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i = 0;

        while (i < arr.length) {
            int k = arr[i];
            ans[k] = i;
            i++;
        }

        return ans;

    }

    public static void subarray(int[] arr) {

        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }

    }

    public static int binarySearch(int[] arr, int k) {

        int last = arr.length - 1;
        int first = 0;
        boolean t = true;

        while (first <= last) {
            int mid = (last + first) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return -1;

    }

    public static void brokenEconomy(int[] arr, int d) {
        int first = 0;
        int last = arr.length - 1;
        int c = 0;
        int f = 0;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == d) {
                c = arr[mid];
                f = arr[mid];
                break;
            }

            else if (arr[mid] < d) {
                f = arr[mid];
                first = mid + 1;
            }

            else {
                c = arr[mid];
                last = mid - 1;
            }
        }
        System.out.println(c);
        System.out.println(f);

    }

    public static int firstIndex(int[] arr, int x) {
        int li = 0;
        int ri = arr.length - 1;
        int fi = -1;

        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (arr[mid] == x) {
                fi = mid;
                ri = mid - 1;
            } else if (arr[mid] < x) {
                li = mid + 1;
            } else {
                ri = mid - 1;
            }
        }

        return fi;
    }

    public static int lastIndex(int[] arr, int x) {

        int li = 0;
        int ri = arr.length - 1;
        int lti = -1;

        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (arr[mid] == x) {
                lti = mid;
                li = mid + 1;
            } else if (arr[mid] < x) {
                li = mid + 1;
            } else {
                ri = mid - 1;
            }
        }

        return lti;
    }

    public static void main(String[] args) {

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // for rotate an array
        // int k = scn.nextInt();
        // int[] ans = rotate(arr, k);

        // for (int i = 0; i < ans.length; i++) {
        // System.out.println(ans[i]);
        // }

        // for inverse of an array
        // int[] ans = inverse(arr);
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }

        // for subarray
        // subarray(arr);

        // for binarySearch
        // int k = scn.nextInt();
        // int ans = binarySearch(arr, k);
        // System.out.println(ans);

        // for broken economy
        // int d = scn.nextInt();
        // brokenEconomy(arr, d);

        // for first index and last index
        int x = scn.nextInt();
        int fi = firstIndex(arr, x);
        int li = lastIndex(arr, x);

        System.out.println(fi);
        System.out.println(li);
    }

}
