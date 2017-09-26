package boj;

import java.util.Scanner;

/*
 * 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이 때, 인접한 수가 같아도 오름차순으로 친다.
 * 예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.
 * 수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
 */
public class N11057 {
    public static void main(String[] args) {
        int mod = 10_007;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] d = new int[n + 1][10];

        for(int i = 0; i < 10; i++) {
            d[1][i] = 1;
        }

        for(int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                for(int k = 0; k <= j; k++) {
                    d[i][j] += d[i - 1][k];
                    d[i][j] %= mod;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += d[n][i];
        }
        System.out.println(sum % mod);
    }
}