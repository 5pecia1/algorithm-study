package chapter1;

import java.util.Scanner;

/*
 * ������ ���� ����� ��Ģ�� ������ �ڿ� ���� ��� ������.
 */
public class N10992 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int in = scanner.nextInt();
		int max = in * 2 - 1;

		{
			int leftSpace = max / 2 - 1;
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j <= leftSpace; j++) {
				builder.append(" ");
			}
			System.out.println(builder + "*");
		}

		for (int i = 2; i < in; i++) { // line
			int leftSpace = max / 2 - i;
			int innerSpace = (i - 1) * 2 - 2;
			StringBuilder builder = new StringBuilder();

			for (int j = 0; j <= leftSpace; j++) {
				builder.append(" ");
			}

			builder.append("*");

			for (int j = 0; j <= innerSpace; j++) {
				builder.append(" ");
			}

			builder.append("*");
			System.out.println(builder);
		}

		if (in != 1) {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < max; i++) {
				builder.append("*");
			}
			System.out.println(builder);
		}
	}
}
