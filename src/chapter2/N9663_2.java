package chapter2;

import java.util.Scanner;

public class N9663_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.println(calc(n, new boolean[n][n], new boolean[n], new boolean[n * 2], new boolean[n * 2], 0));
	}

	/*
	 * check_col = i 번 열에 퀸 이 놓여 있으면 true
	 * check_dig = /대각선에 퀸이 있으면 true row + col
	 * check_dig2 = \대각선에 퀸이 있으면 true row - col + (n - 1)
	 */
	private static int calc(final int n, boolean[][] a, boolean[] checkCol, boolean[] checkDig1, boolean[] checkDig2, int row) {
		if (row == n) {
			return 1;
		}
	
		int sum = 0;
		
		for(int col = 0; col < n; col++) {
			if(check(n, checkCol, checkDig1, checkDig2, row, col)) {
				checkCol[col] = true;
				checkDig1[row + col] = true;
				checkDig2[row - col + n] = true;
				a[row][col] = true;
				
				sum += calc(n, a, checkCol, checkDig1, checkDig2, row + 1);
				
				checkCol[col] = false;
				checkDig1[row + col] = false;
				checkDig2[row - col + n] = false;
				a[row][col] = false;
			}
		}
		
		return sum;
	}

	private static boolean check(final int n, final boolean[] checkCol, final boolean[] checkDig1, final boolean[] checkDig2, final int row, final int col) {
		if(checkCol[col]) {
			return false;
		}
		if(checkDig1[row + col]) {
			return false;
		}
		if(checkDig2[row - col + n]) {
			return false;
		}
		return true;
	}
}
