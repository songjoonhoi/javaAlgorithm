package d04;

import java.util.Scanner;

public class P01 {
    // 숫자의 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 입력값을 String형 변수 snum에 저장한 후 char[]형 변수로 변환

        String snum= sc.next();
        char[] cnum = snum.toCharArray();

        int sum = 0;
        for(int i =0; i< cnum.length; i++){
            sum += cnum[i]- '0'; // cnum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }

        System.out.println(sum);
    }
}
