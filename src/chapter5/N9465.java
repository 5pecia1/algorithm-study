package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 스티커
 */
public class N9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(reader.readLine());

        while(test-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            final int[][] a = new int[2][n + 1];
            int[][] d = new int[n + 1][3];

            for(int i = 0; i < 2; i++) {
                String[] split = reader.readLine().split(" ");
                for(int j = 1; j <= n ; j++) {
                    a[i][j] = Integer.parseInt(split[j - 1]);
                }
            }

            // [x][x], [o][x], [x][o]
            for(int i = 1; i <= n; i++) {
                d[i][0] = max(d, i - 1); //xx
                d[i][1] = ((d[i - 1][0] > d[i - 1][2])? d[i - 1][0] : d[i - 1][2]) + a[0][i];//ox
                d[i][2] = ((d[i - 1][0] > d[i - 1][1])? d[i - 1][0] : d[i - 1][1]) + a[1][i];//xo
            }

            System.out.println(max(d, n));
        }
    }

    private static int max(int[][] d, int i) {
        if(d[i][0] > d[i][1]) {
            return (d[i][0] > d[i][2])? d[i][0] : d[i][2];
        } else if(d[i][1] > d[i][2]) {
            return d[i][1];
        } else {
            return d[i][2];
        }
    }
}
