package Set_2_intermediate;

import java.util.Scanner;

public class Problem_1_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        System.out.print("Enter 5 elements: ");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements are: ");
        for (i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
