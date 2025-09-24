package chap01;

import java.util.Scanner;

// 반복과정에서 조건 판단하기
public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("1~n 까지의 합");

        do{
            System.out.println("n:");
            n = sc.nextInt();
        }while(n <=0);

        int sum=0;

        for(int i =1; i <=n; i++){
            if(i < n) System.out.print(i + " + ");
            else  System.out.print(i + " = ");
            
            sum +=i;
        }
        System.out.println(sum);
    }
    
}
