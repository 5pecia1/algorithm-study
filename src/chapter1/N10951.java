package chapter1;

import java.util.Scanner;

/*
 * �� �� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N10951 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt() + scanner.nextInt());
		}
	}
}
