package chap01;

import java.util.Scanner;

// 3개의 정수값을 입력하고 최댓값 구하기
public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값 구하기");
        System.out.println("a: ");
        int a = sc.nextInt();
        
        System.out.println("b: ");
        int b = sc.nextInt();
        
        System.out.println("c: ");
        int c = sc.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c >max) max = c;

        System.out.println(max);
    }
    
}
