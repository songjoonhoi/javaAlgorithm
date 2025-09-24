package chap01;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

// for문으로 1~n의 합 구하기
public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합");
        System.out.println("n값: ");
        int n = sc.nextInt();

        int sum =0;

        for(int i =1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
