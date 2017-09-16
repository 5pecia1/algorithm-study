package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/*
 * 
 * 1부터 N까지의 수를 임의로 배열한 순열은 총 N! = N×(N-1)×…×2×1 가지가 있다.
 * 임의의 순열은 정렬을 할 수 있다. 예를 들어  N=3인 경우 {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}의 순서로 생각할 수 있다. 첫 번째 수가 작은 것이 순서상에서 앞서며, 첫 번째 수가 같으면 두 번째 수가 작은 것이, 두 번째 수도 같으면 세 번째 수가 작은 것이….
 * N이 주어지면, 아래의 두 소문제 중에 하나를 풀어야 한다. k가 주어지면 k번째 순열을 구하고, 임의의 순열이 주어지면 이 순열이 몇 번째 순열인지를 출력하는 프로그램을 작성하시오.
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
			return false; // 마지막 순열
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
