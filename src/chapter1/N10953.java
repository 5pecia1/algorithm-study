package chapter1;

import java.util.Scanner;

/*
 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
