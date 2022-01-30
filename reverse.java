import java.util.Scanner;

public class reverse {

  public static void reverseOfNumber(int num) {

    while(num>0)
    {
        int a=num%10;
        num/=10;
        System.out.println(a);
    }

  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    reverseOfNumber (n);


} 
}
