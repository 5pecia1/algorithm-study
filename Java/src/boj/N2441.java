package boj;

import java.util.Scanner;

/*
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
 */
public class N2441 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		for(int i = in; i > 0; i--) {
			StringBuilder builder = new StringBuilder();
			for(int j = 0; j < in - i; j++) {
				builder.append(" ");
			}
			for(int j = 0; j < i ; j++) {
				builder.append("*");
			}
			System.out.println(builder);
		}
	}
}
