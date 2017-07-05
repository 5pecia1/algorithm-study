package chapter1;

import java.util.Scanner;

/*
 * 첫째 줄에는 별 2*N-1개, 둘째 줄에는 별 2*N-3개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 별은 가운데를 기준으로 대칭이어야 한다.
 */
public class N2443 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		int max = 2 * in - 1;
		
		for(int i = in; i > 0; i--) {
			int star = 2 * i - 1;
			int spaceHalf = (max - star) / 2;
			
			StringBuilder builder = new StringBuilder();
			for(int j = 0; j < spaceHalf; j++) {
				builder.append(" ");
			}
			for(int j = 0; j < star; j++) {
				builder.append("*");
			}
			System.out.println(builder);
		}
		
	}

}
