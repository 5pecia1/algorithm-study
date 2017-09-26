package boj;

import java.util.Scanner;

/*
 * N개의 정수가 주어진다. 이 때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
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
