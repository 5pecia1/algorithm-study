package chapter1;

import java.util.Scanner;

/*
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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