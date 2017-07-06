package chapter5;

import java.util.Scanner;

/**
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최소값을 출력하시오.
 */
public class N1463TopDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(go(n, new int[n + 1]));
    }

    private static int go(int n, int[] d) {
        if (n == 1) {
            return 0;
        }
        if(d[n] > 0) {
            return d[n];
        }

        d[n] = go(n - 1, d) + 1;

        if (n % 3 == 0) {
            int temp = go(n / 3, d) + 1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n % 2 == 0) {
            int temp = go(n / 2, d) + 1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }

        return d[n];
    }
}
