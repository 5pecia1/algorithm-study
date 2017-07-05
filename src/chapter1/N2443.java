package chapter1;

import java.util.Scanner;

/*
 * ù° �ٿ��� �� 2*N-1��, ��° �ٿ��� �� 2*N-3��, ..., N��° �ٿ��� �� 1���� ��� ����
 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
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
