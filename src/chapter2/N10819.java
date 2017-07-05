package chapter2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * N���� ������ �̷���� �迭 A�� �־�����. �� ��, �迭�� ����ִ� ������ ������ ������ �ٲ㼭 ���� ���� �ִ밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
 */
public class N10819 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int[] numbers = new int[count];
		int max = 0;
		
		for(int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		Arrays.sort(numbers);
	
		do {
			int temp = 0;
			for(int i = 0; i < numbers.length - 1; i ++) {
				temp += Math.abs(numbers[i] - numbers[i + 1]);
			}
			
			if (max < temp) {
				max = temp;
			}
		} while(nextPermutation(numbers));
		
		System.out.println(max);
	}
	
	private static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i -= 1;
		}
		if (i <= 0) {
			return false; // ������ ����
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
