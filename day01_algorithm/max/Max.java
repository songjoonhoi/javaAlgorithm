package max;

import java.util.Scanner;

// 세 값의 최대값 구하기
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구하시오");
        System.out.println("a의 값: "); 
        int a = sc.nextInt();

        System.out.println("b의 값: ");
        int b = sc.nextInt();

        System.out.println("c의 값: ");
        int c = sc.nextInt();
        int max = a;
        if(b > max) max = b;    //a,b,c의 최대값을 구하여 max에 대입한다.`
        if(c > max) max = c;

        System.out.println("최대값은 "+ max + "입니다.");
    }    
}
