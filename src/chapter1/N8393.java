package chapter1;

import java.util.Scanner;

/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		long sum = 0;
		for(int i = scanner.nextInt(); i > 0; i--) {
			sum += i;
		}
		System.out.println(sum);
	}

}
