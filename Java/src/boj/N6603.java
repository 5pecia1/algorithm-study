package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 독일 로또는 {1, 2, ..., 49}에서 숫자 6개를 고른다.
 * 로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 숫자 중 k(k>6)개의 숫자를 골라 집합 S를 만든 다음 그 숫자만 가지고 번호를 선택하는 것이다.
 * 예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 숫자를 고를 수 있는 경우의 수는 총 28가지이다. ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])
 * 집합 S와 k가 주어졌을 때, 숫자를 고르는 모든 방법을 구하는 프로그램을 작성하시오.
 */
public class N6603 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
	
		while(!"0".equals(line)){
			String[] split = line.split(" ");
		
			int count = Integer.parseInt(split[0]);
			
//			for(int i = 0; i <= arr.length - 6; i++) {
//				String[] data = Arrays.copyOfRange(arr, from, to)
//			}
			line = scanner.nextLine();
		}
	}

	private static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i -= 1;
		}
		if (i <= 0) {
			return false; // 마지막 순열
		}
		int j = a.length - 1;
		while (a[j] <= a[i - 1]) {
			j -= 1;
		}
		swap(a, i - 1, j);
		j = a.length - 1;
		while (i < j) {
			swap(a, i, j);
			i += 1;
			j -= 1;
		}
		return true;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
