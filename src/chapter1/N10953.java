package chapter1;

import java.util.Scanner;

/*
 * �� �� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N10953 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int line = Integer.parseInt(scanner.nextLine());
		
		while(line-- > 0) {
			String s = scanner.nextLine();
			String[] split = s.split(",");
			System.out.println(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));
		}
	}
}
