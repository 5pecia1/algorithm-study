package boj;

import java.util.Scanner;

/**
 * 45656이란 수를 보자.
 * 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
 * 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
 * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
 */
public class N10844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] d = new int[n + 1][10];
        for(int i = 1; i < 10; i++) {
            d[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            d[i][0] += d[i - 1][1];
            d[i][9] += d[i - 1][8];
            for(int j = 1; j < 9; j++) {
                d[i][j] += d[i - 1][j + 1] + d[i - 1][j - 1];
                d[i][j] %= 1_000_000_000;
            }
        }

        long sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += d[n][i];
        }
        System.out.println(sum % 1_000_000_000);
    }
}
