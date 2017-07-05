package chapter1;

import java.util.Scanner;

/*
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */
public class N2440 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		for(int i = in; i > 0; i--) {
			StringBuilder builder = new StringBuilder();
			for(int j = 0; j < i ; j++) {
				builder.append("*");
			}
			System.out.println(builder);
		}
	}
}
