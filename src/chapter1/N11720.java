package chapter1;

import java.util.Scanner;

/*
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = Integer.parseInt(scanner.nextLine());
		String line = scanner.nextLine();
	
		int sum = 0;
		while(length-- > 0) {
			sum += Character.getNumericValue(line.charAt(length));
		}
		
		System.out.println(sum);
	}

}
