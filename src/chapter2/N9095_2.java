package chapter2;

import java.util.Scanner;

/*
 * ���� 4�� 1, 2, 3�� �������� ��Ÿ���� ����� �� 7������ �ִ�.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * ���� n�� �־����� ��, n�� 1,2,3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N9095_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int line = scanner.nextInt();
		while(line-- > 0) {
			System.out.println(go(0, 0, scanner.nextInt()));
		}
	}
	
	private static int go(int count, int sum, int goal) { // �Ұ����� ���, ������ ã�� ���, ���� ���
		if (sum > goal) {
			return 0;
		}
		if (goal == sum) {
			return 1;
		}

		int now = count;
		
		for(int i = 1; i <= 3; i++) {
			now += go(count, sum + i, goal);
		}
		
		return now;
	}

}
