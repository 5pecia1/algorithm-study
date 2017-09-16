package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 준규는 N×M 크기의 미로에 갇혀있다. 미로는 1×1크기의 방으로 나누어져 있고, 각 방에는 사탕이 놓여져 있다. 미로의 가장 왼쪽 윗 방은 (1, 1)이고, 가장 오른쪽 아랫 방은 (N, M)이다.
 * 준규는 현재 (1, 1)에 있고, (N, M)으로 이동하려고 한다. 준규가 (i, j)에 있으면, (i+1, j), (i, j+1), (i+1, j+1)로 이동할 수 있고, 각 방을 방문할 때마다 방에 놓여져있는 사탕을 모두 가져갈 수 있다. 또, 미로 밖으로 나갈 수는 없다.
 * 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수의 최대값을 구하시오.
 */
public class N11048_1_BottomUp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = reader.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[][] d = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++) {
            String[] candies = reader.readLine().split(" ");

            for(int j = 1; j <= m; j++) {
                d[i][j] = max3(d[i - 1][j - 1],
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
