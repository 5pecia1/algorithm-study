package chapter1;

import java.util.Scanner;

/*
 * �� �� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N10952 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
		
			if (a == 0 && b == 0) {
				break;
			}
			
			System.out.println(a + b);
		}
	}
}
