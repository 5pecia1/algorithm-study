package chapter2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ����ִ� ������ S�� �־����� ��, �Ʒ� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * add x: S�� x�� �߰��Ѵ�. (1 �� x �� 20) S�� x�� �̹� �ִ� ��쿡�� ������ �����Ѵ�.
 * remove x: S���� x�� �����Ѵ�. (1 �� x �� 20) S�� x�� ���� ��쿡�� ������ �����Ѵ�.
 * check x: S�� x�� ������ 1��, ������ 0�� ����Ѵ�.
 * toggle x: S�� x�� ������ x�� �����ϰ�, ������ x�� �߰��Ѵ�. (1 �� x �� 20)
 * all: S�� {1, 2, ..., 20} ���� �ٲ۴�.
 * empty: S�� ���������� �ٲ۴�. 
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