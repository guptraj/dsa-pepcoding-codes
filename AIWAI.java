import java.util.Scanner;

public class AIWAI {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i;
        do {

            int num = scn.nextInt();
            if (num >= 90 && num <= 100) {
                System.out.println("this is good");
            }

            else if (num >= 80 && num < 90) {
                System.out.println("this is also good");
            }

            else if (num >= 70 && num < 80) {
                System.out.println("this is good as well");
            } else {
                System.out.println("INVALID INPUT");
            }

            System.out.println("what u want to do?? to continue press 1 or to exit press 0");
            i = scn.nextInt();

        }

        while (i == 1);

    }

}
