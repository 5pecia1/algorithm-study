package chapter1;

import java.util.Scanner;

/*
 * 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
 */
public class N2446 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		int max = in;
		
		for(int i = 1; i <= in; i++) {
			printStar(i, max);
		}
		
		for(int i = in - 1; i > 0; i--) {
			printStar(i, max);
		}
		
		
	}
	
	private static void printStar(int star, int max) {
		int spaceHalf = max - star;
		
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
