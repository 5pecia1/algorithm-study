package boj.doing;

import java.util.Scanner;

public class N1987 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.nextLine();
		
		String[] board = new String[r];
		for(int i = 0; i < r; i++) {
			board[i] = scanner.nextLine();
		}
		
	}
	
//	private static int go(final String[] board, boolean[] check, int x, int y, int r, int c) {
//		int count = 0;
//		for(int i = 0; i < 4; i++) {
//		}
//	}

}
