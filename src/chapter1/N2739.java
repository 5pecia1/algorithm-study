package chapter1;

import java.util.Scanner;

/*
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 */
public class N2739 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", in, i, in * i);
		}
	}
}
