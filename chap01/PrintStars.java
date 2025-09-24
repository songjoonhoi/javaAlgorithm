package chap01;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, w;

        System.out.println("*를 n개를 출력하되 w개마다 줄을 바꿔서 출력");

        do{
            System.out.println("n값: ");
            n = sc.nextInt();
        }while(n <=0);

        do{
            System.out.println("w값");
            w= sc.nextInt();
        }while (w <=0 || w > n);

        // for(int i =0; i<n; i++){
        //     System.out.print("*");
        //     if(i % w == w-1){
        //         System.out.println();
        //     }
        // }
        // if(n % w !=0){
        //     System.out.println();
        // }   너무 비효율적

        for(int i =0; i< n / w; i++){
            System.out.println("*".repeat(w)); 
        }
        int rest = n % w;
        if(rest !=0)
        System.out.println("*".repeat(rest));
    }
}

// "*".repeat(w) -> *를 w번 반복한 문자열을 생성하여 반환
// 메서드 repeat()는 String 클래스에 들어 있는 인스턴스 메서드
// ex) String 클래스형 변수 s에 문자열 G12를 넣고 s.repeat(2)를 호출하면 G12G12 를 반환
