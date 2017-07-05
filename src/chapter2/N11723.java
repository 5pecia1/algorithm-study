package chapter2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
 * add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
 * remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
 * check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
 * toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
 * all: S를 {1, 2, ..., 20} 으로 바꾼다.
 * empty: S를 공집합으로 바꾼다. 
 */
public class N11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int s = 0;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int lineCount = Integer.parseInt(bufferedReader.readLine());
		
		while(lineCount-- > 0) {
			String[] split = bufferedReader.readLine().split(" ");
			
			switch(split[0]) {
			case "add":
				s |= 1 << Integer.parseInt(split[1]);
				break;
			case "remove":
				s &= ~(1 << Integer.parseInt(split[1]));
				break;
			case "check":
				writer.write(((s & (1 << Integer.parseInt(split[1]))) != 0)? "1\n" : "0\n");
				break;
			case "toggle":
				s ^= (1 << Integer.parseInt(split[1]));
				break;
			case "all":
				s = (1 << 31) - 1;
				break;
			case "empty":
				s = 0;
				break;
			default:
				break;
			}
			writer.flush();
		}
	}
}
