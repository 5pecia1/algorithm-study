package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = bufferedReader.readLine().split(" ");
        String a = split[0] + split[1];
        String b = split[2] + split[3];

        System.out.println(Long.valueOf(a) + Long.valueOf(b));
    }
}
