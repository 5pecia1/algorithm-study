package chapter2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * N�� �־����� ��, 1���� N������ ���� �̷���� ������ ���������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N10974 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));


		int n = scanner.nextInt();
		
		int[] numbers = new int[n];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
	
		do {
			for(int i = 0; i < numbers.length; i++) {
				writer.write(numbers[i] + " ");
			}
			writer.write("\n");
		} while(nextPermutation(numbers));
		writer.flush();
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
