package chapter5;

import java.util.Scanner;

/**
 * 효주는 포도주 시식회에 갔다. 그 곳에 갔더니, 테이블 위에 다양한 포도주가 들어있는 포도주 잔이 일렬로 놓여 있었다. 효주는 포도주 시식을 하려고 하는데, 여기에는 다음과 같은 두 가지 규칙이 있다.
 * 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
 * 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
 * 효주는 될 수 있는 대로 많은 양의 포도주를 맛보기 위해서 어떤 포도주 잔을 선택해야 할지 고민하고 있다. 1부터 n까지의 번호가 붙어 있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여 있고, 각 포도주 잔에 들어있는 포도주의 양이 주어졌을 때, 효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램을 작성하시오.
 * 예를 들어 6개의 포도주 잔이 있고, 각각의 잔에 순서대로 6, 10, 13, 9, 8, 1 만큼의 포도주가 들어 있을 때, 첫 번째, 두 번째, 네 번째, 다섯 번째 포도주 잔을 선택하면 총 포도주 양이 33으로 최대로 마실 수 있다.
 */
public class N2165_2DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] d = new int[count + 1][3];//x, o, oo

        for(int i = 1; i <= count; i++) {
            int a = scanner.nextInt();

            d[i][0] = max(d, i - 1);
            d[i][1] = d[i - 1][0] + a;
            d[i][2] = d[i - 1][1] + a;
        }

        System.out.println(max(d, count));
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
