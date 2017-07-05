package chapter1;

import java.util.Scanner;

/*
 * 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
 */
public class N2444 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		int max = 2 * in - 1;
		
		for(int i = 1; i <= in; i++) {
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
		
		for(int i = in - 1; i > 0; i--) {
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
