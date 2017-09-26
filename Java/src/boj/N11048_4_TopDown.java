package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sol on 17. 7. 7.
 */
public class N11048_4_TopDown {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = reader.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[][] d = new int[n + 1][m + 1];
        int[][] a = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++) {
            String[] candies = reader.readLine().split(" ");

            for(int j = 1; j <= m; j++) {
                a[i][j] = Integer.parseInt(candies[j - 1]);
            }
        }

        System.out.println(go(n, m, d, a));
    }

    private static int go(int i, int j, int[][] d, int[][] a) {
        if(i == 1 && j == 1) {
            return a[1][1];
        }
        if(i < 1 || j < 1) {
            return 0;
        }

        if(d[i][j] > 0) {
            return d[i][j];
        }

        d[i][j] = go(i - 1, j, d, a) + a[i][j];
        int temp = go(i, j - 1, d, a) + a[i][j];

        if(d[i][j] < temp) {
            d[i][j] = temp;
        }

        return d[i][j];
    }
}
