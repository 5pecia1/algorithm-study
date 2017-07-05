package chapter2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ٷ� ���� �ֹ��� ������ �� ���踦 �ָӴϿ� ���� ä �����ϰ� ����� �� ������ Ȳ���� ��Ȳ�� ������ ��������, 702ȣ�� ���ο� ���� �ý����� ��ġ�ϱ�� �Ͽ���. �� ���� �ý����� ���谡 �ƴ� ��ȣ�� �����ϰ� �Ǿ� �ִ� �ý����̴�.
 * ��ȣ�� ���� �ٸ� L���� ���ĺ� �ҹ��ڵ�� �����Ǹ� �ּ� �� ���� ������ �ּ� �� ���� �������� �����Ǿ� �ִٰ� �˷��� �ִ�. ���� ���ĵ� ���ڿ��� ��ȣ�ϴ� �������� �������� �̷�� ���� ��ȣ�� �̷�� ���ĺ��� ��ȣ���� �����ϴ� ������ �迭�Ǿ��� ���̶�� �����ȴ�. ��, abc�� ���ɼ��� �ִ� ��ȣ������ bac�� �׷��� �ʴ�.
 * �� ���� �ý��ۿ��� �������� ��ȣ�� ������� ���� ������ ������ C������ �ִٰ� �Ѵ�. �� ���ĺ��� �Լ��� �ν�, ���� ������ �������� �濡 ħ���ϱ� ���� ��ȣ�� ������ ������ �Ѵ�. C���� ���ڵ��� ��� �־����� ��, ���ɼ� �ִ� ��ȣ���� ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N1759 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int l = scanner.nextInt();
		int c = scanner.nextInt();
	
		scanner.nextLine();
		String[] split= scanner.nextLine().split(" ");
		char[] alpha = new char[c];
		for(int i = 0; i < c; i++) {
			alpha[i] = split[i].charAt(0);
		}
		Arrays.sort(alpha);
		go(l, alpha, "", 0);
	}
	
	private static void go(final int n, final char[] alpha, String password, int i) {
	
		if (password.length() == n) {
			if (check(password)) {
				System.out.println(password);
			}
			return;
		}
		if (i >= alpha.length) {
			return;
		}
		
		go(n, alpha, password + alpha[i], i + 1);
		go(n, alpha, password, i + 1);
	}

	private static boolean check(final String pw) {
		int ja = 0;
		int mo = 0;

		for(int i = 0; i < pw.length(); i++) {
			switch (pw.charAt(i)) {
			case 'a': case 'e' : case 'i' : case 'o' : case 'u':
				mo++;
				break;
			default:
				ja++;
				break;
			}
		}
		
		return ja >= 2 && mo >= 1;
	}
}
