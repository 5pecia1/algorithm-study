package chapter1;

import java.util.Scanner;

/*
 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
 * ������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
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