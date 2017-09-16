package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N×N 게임판에 수가 적혀져 있다. 이 게임의 목표는 가장 왼쪽 위 칸에서 가장 오른쪽 아래 칸으로 규칙에 맞게 점프를 해서 가는 것이다.
 * 각 칸에 적혀있는 수는 현재 칸에서 갈 수 있는 거리를 의미한다. 반드시 오른쪽이나 아래쪽으로만 이동해야 한다. 0은 더 이상 진행을 막는 종착점이며, 항상 현재 칸에 적혀있는 수만큼 오른쪽이나 아래로 가야 한다.
 * 가장 왼쪽 위 칸에서 가장 오른쪽 아래 칸으로 규칙에 맞게 이동할 수 있는 경로의 개수를 구하는 프로그램을 작성하시오.
 */
public class N1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[][] a = new int[n][n];
        long[][] d = new long[n][n]; // 경로의 개수 2^63-1

        for(int i = 0; i < n; i++) {
            String[] split = reader.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(split[j]);
            }
        }

        d[0][0] = 1;


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    continue;
                }

                for(int k = 0; k < j; k++) {
                    if(a[i][k] == j - k) {
                        d[i][j] += d[i][k];
                    }
                }

                for(int k = 0; k < i; k++) {
                    if(a[k][j] == i - k) {
                        d[i][j] += d[k][j];
                    }
                }
            }
        }

        System.out.println(d[n - 1][n - 1]);
    }
}
