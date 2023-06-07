package 알고리즘테스트3;

import java.util.Scanner;

//입력받은 수보다 작은 소수의 합을 구하는 메소드
public class AlgorithmTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt(); // 정수를 입력받을 스캐너
        int rst = 0; // 결과값을 담을 변수 선언
        for(int i = 2; i < num; i++) { // 소수인지 여부를 판별하여 결과값에 더하는 반복문
            if(isPrime(i)) {
                rst += i;
            }
        }
        System.out.print("소수의 합 : " + rst); // 결과값을 출력
    }
    static boolean isPrime(int num) { // 소수인지 아닌지 판별하는 메소드
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

}
