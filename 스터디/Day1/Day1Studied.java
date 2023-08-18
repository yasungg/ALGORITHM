package 스터디.Day1;

import java.util.Scanner;

public class Day1Studied {
    public static void main(String[] args) {

        //문제 : N개의 숫자가 공백 없이 쓰여 있다. 이 숫자들을 모두 합해 출력하는 프로그램을 작성하시오.
        //단, (1 <= N <= 100)
        //입력값은 숫자의 갯수 N과 공백없이 쓰여있는 숫자배열 두 개.

        //자릿수를 입력받는다.
        //숫자열을 String으로 입력받는다.
        //String으로 입력받은 숫자열을 ToCharArray 메소드를 통해 char 배열로 변환한다.
        //변환한 char 배열을 향상된 for문을 통해 int로 전환한 뒤 지역 변수 sum에 축적한다.
        //sum을 출력한다.

        Scanner sc = new Scanner(System.in);

        System.out.print("자릿수를 입력하세요. : ");
        int N = sc.nextInt();
        System.out.print("숫자열을 입력하세요. : ");
        String Default = sc.next();

        char[] arr = Default.toCharArray();
        int sum = 0;

        for(char element : arr) {
            sum += element - '0';
        }

        System.out.print("결과 : " + summary(N, Default));
        System.out.print("결과 : " + sum);
    }
    
    static int summary(int N, String Default) {
        char[] arr = Default.toCharArray();
        int sum = 0;

        for(char element : arr) {
            sum += element - '0';
        }

        return sum;
    }

}
