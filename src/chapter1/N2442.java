package chapter1;

import java.util.Scanner;

/*
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2*N-1���� ��� ����
 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
 */
public class N2442 {
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
	}
}
