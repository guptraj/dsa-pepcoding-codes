import java.util.Scanner;

public class inverse2 {

  public static int countOfDigits(int num) {
    int count = 0;
    while (num != 0) {
      num /= 10;
      count++;
    }
    return count;
  }

  public static void inverseONumber(int num) {
    int lastDigit = countOfDigits(num);
    int digits = lastDigit;
    int inverse = 0;

    while (num != 0) {
      int ld = num % 10;

      inverse += lastDigit * (int) Math.pow(10, digits - ld);
      lastDigit--;
      num /= 10;

    }

    System.out.println(inverse);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    inverseONumber(n);
  }
}
