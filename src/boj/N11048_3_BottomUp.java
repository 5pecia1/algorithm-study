package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sol on 17. 7. 7.
 */
public class N11048_3_BottomUp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = reader.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[][] d = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++) {
            String[] candies = reader.readLine().split(" ");

            for(int j = 1; j <= m; j++) {
                d[i][j] = max2(
                        d[i][j - 1],
                        d[i - 1][j]) +
                        Integer.parseInt(candies[j - 1]);
            }
        }

        System.out.println(d[n][m]);
    }

    private static int max3(int i, int j, int k) {
        int l = max2(i, j);
        return (l > k)? l : k;
    }

    private static int max2(int i, int j) {
        return (i > j)? i : j;
    }
}
