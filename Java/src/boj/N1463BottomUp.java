package boj;

import java.util.Scanner;

/**
 * Created by sol on 17. 7. 6.
 */
public class N1463BottomUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] d = new int[n + 1];

        d[1] = 0;

        for(int i = 2; i <= n ; i++) {

            d[i] = d[i - 1] + 1;

            if (i % 2 == 0 && d[i / 2] + 1 < d[i]) {
                d[i] = d[i / 2] + 1;
            }
            if (i % 3 == 0 && d[i / 3] + 1 < d[i]) {
                d[i] = d[i / 3] + 1;
            }
        }

        System.out.println(d[n]);
    }
}
