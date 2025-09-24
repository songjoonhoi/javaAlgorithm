package chap01;

import java.util.Scanner;

// + - 번갈아 출력
public class Alternative {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+ -를 번갈아 n개 출력");

        do{
            System.out.println("n값: ");
            n = sc.nextInt();
        }while(n <=0);

        for(int i =0; i <n; i++){
            if(i % 2 ==0) System.out.print("+");
            else System.out.print("-");
        }
    }
}
