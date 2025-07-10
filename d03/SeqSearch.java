// 선형 검색
// 배열에서 검색하는 방법 가운데 가장 기본적인 알고리즘

import java.util.Scanner;

public class SeqSearch {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색

    static int SeqSearch(int[] a, int n, int key){
        int i=0;

        // 보초법
        a[n] = key;

        while(true){
            if(a[i] ==key){
                break;
            }
            i++;
        }
        return i == n ? -1:i;

        /* 요소를 순서대로 검색하는 선형 검색은 요소가 정렬되지 않은 배열에서 검색할때 사용하는 유일한 방법
        for(int i=0; i<n; i++){
            if(a[i] == key){return i;}
            return -1; 
        }
         * 
         */
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요숫소: ");
        int num = sc.nextInt();
        int []x = new int[num +1]; // 요솟수가 num + 1 인 배열

        for(int i=0; i< num; i++){
            System.out.println("x[ "+ i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할 값:");
        int ky = sc.nextInt();

        int idx= SeqSearch(x,num,ky); // 배열 x에서 값이 ky인 요소를 검색

        if(idx == -1){System.out.println("그 값의 요소가 없습니다.");}
        else{System.out.println("그 값의 x[" + idx +"]에 있습니다.");}

    }


}
