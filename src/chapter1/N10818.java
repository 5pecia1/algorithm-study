package chapter1;

import java.util.Scanner;

/*
 * N���� ������ �־�����. �� ��, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class N10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max;
        int min = max = sc.nextInt();
        while (t-- > 1) {
        	int in = sc.nextInt();
        	if(in < min) {
        		min = in;
        	}
        	if(in > max) {
        		max = in;
        	}
        }
        
        System.out.printf("%d %d", min, max);
	}
}
