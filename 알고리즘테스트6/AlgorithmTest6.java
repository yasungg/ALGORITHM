package 알고리즘테스트6;

import java.util.Scanner;

//윤년구하기. 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때.
public class AlgorithmTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요. : ");
        int year = sc.nextInt();
        System.out.print(isYear(year));
    }
    static int isYear(int year) {
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return 1;
        else return 0;
    }
}
