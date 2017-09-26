package boj;

import java.util.Scanner;

/**
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class N9095DynamicProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] d = new int[11];
        d[0] = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    d[i] += d[i - j];
                }
            }
        }
        int line = scanner.nextInt();
        while (line-- > 0) {
            int n = scanner.nextInt();
            System.out.println(d[n]);
        }
	}
}
