package chap01;
// 논리 연산과 드모르간 법칙
// 2자리 양수(10~99)를 입력
import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력");

        do{
            System.out.println("no값: ");
            no = sc.nextInt();
        }while(no <10 || no > 99);

        System.out.println("변수 no값은 "+ no + "이 되었습니다.");
    }

    
}
