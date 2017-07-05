package chapter2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ���� �ζǴ� {1, 2, ..., 49}���� ���� 6���� ����.
 * �ζ� ��ȣ�� �����ϴµ� ���Ǵ� ���� ������ ������ 49���� ���� �� k(k>6)���� ���ڸ� ��� ���� S�� ���� ���� �� ���ڸ� ������ ��ȣ�� �����ϴ� ���̴�.
 * ���� ���, k=8, S={1,2,3,5,8,13,21,34}�� ��� �� ���� S���� ���ڸ� �� �� �ִ� ����� ���� �� 28�����̴�. ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])
 * ���� S�� k�� �־����� ��, ���ڸ� ���� ��� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
