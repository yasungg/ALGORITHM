package 알고리즘테스트1;

import java.util.Scanner;

public class AlgorithmTest1 {
    //핸드폰 요금
    //영식 요금제 : 30초 10원
    //민식 요금제 : 60초 15원
    //입력은 첫 줄에 통화 횟수
    //두번째 줄에 통화 횟수당 통화 시간
    //결과 : 둘 중에 싼 요금제의 이름을 표시하고 총 통화 요금을 표시
    //3
    //40 40 40
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int M = 0;
        int Y = 0;
        System.out.print("통화 횟수를 입력하세요. : ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            System.out.print((i+1) + "번째 통화의 통화 시간을 입력하세요. : ");
            int times = sc.nextInt();

            sum1 += ((times / 30) * 10) + 10;
            sum2 += ((times / 60) * 15) + 15;
        }

        System.out.println("영식 총 통화 요금 : " + sum1);
        System.out.println("민식 총 통화 요금 : " + sum2);
        if(sum1 > sum2) {
            System.out.print("민식의 통화 요금이 더 쌉니다. 민식의 통화 요금 : " + sum2);
        } else if(sum1 < sum2) {
            System.out.print("영식의 통화 요금이 더 쌉니다. 영식의 통화 요금 : " + sum1);
        } else {
            System.out.print("두 요금제의 가격은 같습니다. M, Y = " + sum1);
        }
    }
}
