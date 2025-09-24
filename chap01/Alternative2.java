package chap01;

import java.util.Scanner;

// +와 - 를 번갈아 출력 2
public class Alternative2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("+ 와 -를 번갈아 가면 출력");

        do{
            System.out.println("n값:");
            n = sc.nextInt();
        }while(n <=0);

        for(int i =0; i<n/2; i++){
            System.out.println("+-");
        
            
        }
    }
}
