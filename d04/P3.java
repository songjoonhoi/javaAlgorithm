package d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 합 배열 S를 만드는 공식 S[i] = S[i-1] + A[i]
// 구간의 합을 구하는 공식 S[j] - S[i-1]
// 시간 복잡도를 줄일수 있음

/*
 * suNo(숫자 개수), quizNo(질의 개수) 저장하기
 * 
 * for(숫자 개수만큼 반복하기){
 *  합 배열 생성하기 S[i] = S[i-1] + A[i]
 * }
 * 
 * for(질의 개수만큼 반복하기){
 *  질의 범위 받기(i~j)
 * 구간 합 출력하기 S[j] - S[i-1]
 * }
 */

public class P3 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = 
        new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer((bufferedReader.readLine()));
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<= suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q =0; q< quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i =Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i -1]);
        }
    }
}
