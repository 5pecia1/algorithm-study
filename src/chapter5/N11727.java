package chapter5;

import java.util.Scanner;

/**
 * 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class N11727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] d = new int[n + 1];

        d[0] = 1;
        d[1] = 1;

        for(int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + 2 * d[i - 2];
            d[i] %= 10007;
        }

        System.out.println(d[n]);
    }
}
