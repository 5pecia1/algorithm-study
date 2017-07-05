package chapter2;

import java.util.Scanner;

/*
 * N-Queen ������ ũ�Ⱑ N �� N�� ü���� ���� �� N���� ���� ������ �� ���� ���� �����̴�.
 * N�� �־����� ��, ���� ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		// ����
		for (int i = 0; i < n; i++) {
			if (i == row) {
				continue;
			}
			if(a[i][col]) {
				return false;
			}
		}
	
		// ���� �Ʒ�
		int x = row - 1;
		int y = col - 1;
		
		while(x >= 0 && y >= 0) {
			if(a[x][y]) {
				return false;
			}
			x--;
			y--;
		}
		
		// ���� ��
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
