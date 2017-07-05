package chapter2;

import java.util.Scanner;

/*
 * 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지가 있다.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class N9095_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int line = scanner.nextInt();
		while(line-- > 0) {
			System.out.println(go(0, 0, scanner.nextInt()));
		}
	}
	
	private static int go(int count, int sum, int goal) { // 불가능한 경우, 정답을 찾은 경우, 다음 경우
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
