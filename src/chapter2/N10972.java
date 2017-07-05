package chapter2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 1���� N������ ���� �̷���� ������ �ִ�. �� ��, ���������� ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ������ ���� �ռ��� ������ ������������ �̷���� �����̰�, ���� �������� ���� ������ ������������ �̷���� �����̴�.
 * N = 3�� ��쿡 ���������� ������ �����ϸ� ������ ����.
 * 
 * 1, 2, 3
 * 1, 3, 2
 * 2, 1, 3
 * 2, 3, 1
 * 3, 1, 2
 * 3, 2, 1
 */
public class N10972 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(reader.readLine());
		String[] numberSplit = reader.readLine().split(" ");
		int[] numbers = new int[count];

		for (int i = 0; i < count; i++) {
			numbers[i] = Integer.parseInt(numberSplit[i]);
		}

		if (nextPermutation(numbers)) {
			for (int i : numbers) {
				writer.write(i + " ");
			}
			writer.flush();
			return ;
		}

		System.out.println(-1);
	}

	private static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i])
			i -= 1;
		if (i <= 0)
			return false; // ������ ����
		int j = a.length - 1;
		while (a[j] <= a[i - 1])
			j -= 1;
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
