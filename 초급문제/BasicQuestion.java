package 초급문제;
//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤 대문자는 소문자로, 소문자는 대문자로 치환하는 프로그램을 만드시오.

//3자리의 정수를 입력받아 가장 큰 숫자 출력

//사용자에 의해 2개의 문자열을 입력 후 공통의 글자가 몇 개인지 확인.
//공통 부분 문자열과 그 길이를 인쇄
//공통 부분 문자열이 없으면 "No CS"를 인쇄하고 0을 길이로 인쇄.

import java.util.Scanner;

//문자열 반전 : ex:ABCDEF => FEDCBA
public class BasicQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String in = sc.nextLine();
//        for(int i = 0; i < in.length(); i++) {
//            char ch = in.charAt(i);
//            if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
//            else System.out.print((char)(ch + ('a' + 'A')));
//        }
        System.out.print("문자열 입력 : ");
        String in = sc.nextLine();
        for(int i = in.length()-1; i >= 0; i--) {
            System.out.print(in.charAt(i));
        }
        System.out.println();

    }
}
