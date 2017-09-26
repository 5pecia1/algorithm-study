package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11023 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long sum = 0;
        while(stringTokenizer.hasMoreTokens()) {
            sum += Integer.valueOf(stringTokenizer.nextToken());
        }
        System.out.println(sum);
    }
}
