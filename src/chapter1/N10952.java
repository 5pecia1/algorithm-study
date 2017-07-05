package chapter1;

import java.util.Scanner;

/*
 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
