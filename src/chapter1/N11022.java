package chapter1;

import java.util.Scanner;

/*
 * �� �� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N11022 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int line = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= line; i++) {
			String s = scanner.nextLine();
			String[] split = s.split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
		}
	}
}
