package d02;

import java.util.Scanner;

// 배열 요소의 최댓값 출력
public class MaxOfArray {
    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a){
        int max = a[0];
        for(int i =0; i<a.length; i++){
            if(a[i]> max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");

        System.out.println("사람 수: ");
        int num = sc.nextInt();

        int [] height = new int[num];

        for( int i =0; i< num; i++){
            System.out.println("height[" + i + "]: ");
            height[i] = sc.nextInt(); 
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
    
}
