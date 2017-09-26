package boj;

import java.util.Scanner;

/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
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
