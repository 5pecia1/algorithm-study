package chapter2;

import java.util.Scanner;

/*
 * N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
 * N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 *  => n^n^2
 */
public class N9663 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
	
		System.out.println(calc(n, new boolean[n][n], 0));
	}
	
	private static int calc(final int n, boolean[][] a, int row) {
		if (row == n) {
			return 1;
		}
	
		int sum = 0;
		
		for(int col = 0; col < n; col++) {
			a[row][col] = true;
			
			if(check(n, a, row, col)) {
				sum += calc(n, a, row + 1);
			}
			
			a[row][col] = false;
		}
		
		return sum;
	}

	private static boolean check(final int n, final boolean[][] a, int row, int col) {
		// 수직
		for (int i = 0; i < n; i++) {
			if (i == row) {
				continue;
			}
			if(a[i][col]) {
				return false;
			}
		}
	
		// 왼쪽 아래
		int x = row - 1;
		int y = col - 1;
		
		while(x >= 0 && y >= 0) {
			if(a[x][y]) {
				return false;
			}
			x--;
			y--;
		}
		
		// 왼쪽 위
		x = row - 1;
		y = col + 1;
		while(x >= 0 && y < n) {
			if (a[x][y]) {
				return false;
			}
			x--;
			y++;
		}
		
		return true;
	}
}
