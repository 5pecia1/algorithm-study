package boj;

import java.util.Scanner;

/*
 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
