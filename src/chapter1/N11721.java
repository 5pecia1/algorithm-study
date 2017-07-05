package chapter1;

import java.util.Scanner;

/*
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */
public class N11721 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder line = new StringBuilder(scanner.nextLine());

		while(!"".equals(line.toString())) {
			int end = (line.length() < 10)? line.length() : 10;
			System.out.println(line.substring(0, end));
			line.delete(0, end);
		}
	}
}