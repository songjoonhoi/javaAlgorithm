package chap01;

import java.util.Scanner;

// 입력한 정숫값의 부호(양수/음수/0)을 판단

public class JudgeSign {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("정수입력: ");
        int n = sc.nextInt();

        if( n>0)System.out.println("이수는 양수");
        else if(n<0)System.out.println("이수는 음수");
        else System.out.println("0입니다.");
    }
    
}
