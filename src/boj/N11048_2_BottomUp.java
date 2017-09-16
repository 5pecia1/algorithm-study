package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sol on 17. 7. 7.
 */
public class N11048_2_BottomUp {
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

        d[1][1] = a[1][1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if (j + 1 <= m && d[i][j+1] < d[i][j] + a[i][j+1]) {
                    d[i][j+1] = d[i][j] + a[i][j+1];
                }
                if (i + 1 <= n && d[i+1][j] < d[i][j] + a[i+1][j]) {
                    d[i+1][j] = d[i][j] + a[i+1][j];
                }
                if (i + 1 <= n && j + 1 <= m && d[i+1][j+1] < d[i][j] + a[i+1][j+1]) {
                    d[i+1][j+1] = d[i][j] + a[i+1][j+1];
                }
            }
        }

        System.out.println(d[n][m]);
    }
}
