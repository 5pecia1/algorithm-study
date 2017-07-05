package chapter2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 
 * 1���� N������ ���� ���Ƿ� �迭�� ������ �� N! = N��(N-1)������2��1 ������ �ִ�.
 * ������ ������ ������ �� �� �ִ�. ���� ���  N=3�� ��� {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}�� ������ ������ �� �ִ�. ù ��° ���� ���� ���� �����󿡼� �ռ���, ù ��° ���� ������ �� ��° ���� ���� ����, �� ��° ���� ������ �� ��° ���� ���� ���̡�.
 * N�� �־�����, �Ʒ��� �� �ҹ��� �߿� �ϳ��� Ǯ��� �Ѵ�. k�� �־����� k��° ������ ���ϰ�, ������ ������ �־����� �� ������ �� ��° ���������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N1722 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		
		int[] numbers = new int[n];
		int count = 0;
		while(count < numbers.length) {
			numbers[count] = ++count;
		}

		String[] split = reader.readLine().split(" ");
		switch(split[0]) {
		case "1":
			count = Integer.parseInt(split[1]);
			while(count-- > 1) {
				nextPermutation(numbers);
			}
			
			count = 0;
			while(count < n) {
				writer.write(numbers[count++] + " ");
			}
			break;
		case "2":
			int[] input = new int[n];
			count = 1;
			while(count <= n) {
				 input[count - 1] = Integer.parseInt(split[count++]);
			}
			count = 1;
			while(!checkArray(input, numbers)) {
				nextPermutation(numbers);
				count++;
			}
			writer.write(count + "");
			break;
		}
		
		writer.flush();
	}
	
	private static boolean checkArray(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i--;
		}
		if (i <= 0) {
			return false; // ������ ����
		}
		int j = a.length - 1;
		while (a[j] <= a[i - 1]) {
			j--;
		}
		swap(a, i - 1, j);
		j = a.length - 1;
		while (i < j) {
			swap(a, i, j);
			i++;
			j--;
		}
		return true;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
