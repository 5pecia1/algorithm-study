package chapter1;

import java.util.Scanner;

/*
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 */
public class N2438 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int in = scanner.nextInt();
		for(int i = 1; i <= in; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
