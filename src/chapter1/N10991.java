package chapter1;

import java.util.Scanner;

/*
 * ������ ���� ����� ��Ģ�� ������ �ڿ� ���� ��� ������.
 */
public class N10991 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		int max = in * 2 - 1;
		
		for(int i = 1; i <= in; i++) {
			int leftSpace = max / 2 - i;
			StringBuilder builder = new StringBuilder();
			for(int j = 0; j <= leftSpace; j++) {
				builder.append(" ");
			}
			builder.append("*");
			for(int j = 0; j < i - 1; j++) {
				builder.append(" *");
			}
			System.out.println(builder);
		}
	}
}
