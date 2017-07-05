package chapter1;

import java.util.Scanner;

/*
 * ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N1924 {
	enum DAY {
		SUN, MON, TUE, WED, THU, FRI, SAT
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String in = scanner.nextLine();
		String[] split = in.split(" ");
		
		int mon = Integer.parseInt(split[0]);
		int day = Integer.parseInt(split[1]);
	
		for(int i = 1; i < mon; i++) {
			switch (i) {
			case 1:case 3:case 5:
			case 7:case 8:case 10:
			case 12:
				day += 31;
				break;
			case 4:case 6:case 9:
			case 11:
				day += 30;
				break;
			default:
				day += 28;
				break;
			}
		}
	
		System.out.println(DAY.values()[day%7]);
	}

}
