package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(val + "\t");
                int newval = (val * (i - j)) / (j + 1);
                val = newval;
            }
            System.out.println();
        }
    }
}
