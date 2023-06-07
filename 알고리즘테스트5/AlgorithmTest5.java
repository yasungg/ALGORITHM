package 알고리즘테스트5;

import java.util.Scanner;

//불기 연도가 주어졌을 때 서기 연도로 바꿔주는 프로그램을 작성하시오.
public class AlgorithmTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("불기 연도 : ");
        int buddha = sc.nextInt();
        System.out.print("서기 연도 : " + (buddha - 543));
    }

}
