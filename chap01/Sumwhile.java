package chap01;

import java.util.Scanner;

// while문으로 1~n의 합 구하기
public class Sumwhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum =0;
        int i =1;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("1부터 "+ n + "까지의 합은 "+ sum + "입니다.");
        
    }
}
