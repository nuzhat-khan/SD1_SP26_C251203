package Set_1_beginner;

import java.util.Scanner;

public class Problem_9_Set_1 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        int i, result = 0;
        for (i = 1; i <= num; i++) {
            result = result + i;
        }
        System.out.println("Sum of all numbers from 1 to " + num + " is = " + result);
    }
}
