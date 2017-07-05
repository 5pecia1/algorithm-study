package chapter2;

import java.io.IOException;
import java.util.Scanner;

/*
 * 스도쿠
 * 출처 : https://gist.github.com/Baekjoon/687e776019684b5aca54
 */
public class N2580 {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int[][] a = new int[9][9];
		boolean[][][] c = new boolean[3][9][10];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				a[i][j] = scanner.nextInt();
				
				if(a[i][j] != 0) {
					c[0][i][a[i][j]] = true;
					c[1][j][a[i][j]] = true;
					c[2][smallBox(i, j)][a[i][j]] = true;
				}
			}
		}
		
		go(a, c, 0);
	}
	
	private static boolean go(int[][] sudoku, boolean[][][] check, int count) {
		if(count == 81) {
			for (int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					System.out.print(sudoku[i][j] + " ");
				}
				System.out.println();
			}
			
			return true;
		}
		
		int row = count / 9;
		int col = count % 9;
		
		if(sudoku[row][col] != 0) {
			return go(sudoku, check, count + 1);
		} else {
			for(int num = 1; num <= 9; num++) {
				if(!check[0][row][num] && !check[1][col][num] && !check[2][smallBox(row, col)][num]) {
					check[0][row][num] = check[1][col][num] = check[2][smallBox(row, col)][num] = true;
					sudoku[row][col] = num;
					
					if(go(sudoku, check, count + 1)) {
						return true;
					}
					
					sudoku[row][col] = 0;
					check[0][row][num] = check[1][col][num] = check[2][smallBox(row, col)][num] = false;
				}
			}
		}
		return false;
	}

	private static int smallBox(int i, int j) {
		return (i / 3) * 3 + j / 3;
	}
}
