package chapter1;

import java.util.Scanner;

/*
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * ������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
 */
public class N2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt();
		for(int i = 1; i <= in; i++) {
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
