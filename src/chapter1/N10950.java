package chapter1;

import java.util.Scanner;

/*
 * �� �� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		while(line-- > 0) {
			System.out.println(scanner.nextInt() + scanner.nextInt());
		}
	}

}
