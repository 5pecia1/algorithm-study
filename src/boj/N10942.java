package boj;

import java.util.Scanner;

/**
 * Created by sol on 17. 7. 7.
 */
public class N10942 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] split = scanner.nextLine().split(" ");
        StringBuilder data = new StringBuilder(n);
        for(int i = 0; i < n; i++) {
            data.append(split[i]);
        }

//        int[] d = new int[]{-1,..};

        int m = Integer.parseInt(scanner.nextLine());

        while(m-- > 0) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();


        }
    }
//    private static int go (int i, int j) {
//        if(i == j) {
//            return 1;
//        }
//
//
//    }
}
