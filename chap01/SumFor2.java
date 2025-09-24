package chap01;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

// 양수만 입력받아 1~n까의 합
public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합");

        do{
            System.out.println("n값:");
            n = sc.nextInt();
        }while(n<=0);

        int sum = 0;

        for(int i =1; i <=n; i++){
            sum+=i;
        }
        System.out.println("sum:" + sum);
    }
    
}
