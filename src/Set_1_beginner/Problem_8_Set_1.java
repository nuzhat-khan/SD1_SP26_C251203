package Set_1_beginner;

import java.util.Scanner;

public class Problem_8_Set_1 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        System.out.print(num + "! = ");
        int i, result = 1;
        for (i = num; i >= 1; i--) {
            result = result * i;
            if (i != 1) {
                System.out.print(i + " X ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + result);
    }
}
