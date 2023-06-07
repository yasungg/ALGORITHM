package 기본문제2번;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BasicTestNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하세요. : ");
//        int n = sc.nextInt();
//
//        for(int i = 1; i < (n * n)+1; i++) {
//            System.out.printf("%4d", i);
//            if(i % n == 0) System.out.println();
//
//        }

        //1~1000 사이의 7의 배수를 구하고 한 줄에 10개 항목씩 출력
//        for(int i = 1; i <= 1000; i++) {
//            if(i % 7 == 0) {
//                System.out.printf("%4d", i);
//                if(i % 10 == 0) System.out.println();
//            }
//        }
        //n개의 정수를 입력받아 최소값과 최대값 구하기

//        System.out.print("정수를 입력하세요. : ");
//        int n = sc.nextInt();
//
//        int[] numbers = new int[n];
//        System.out.print("정수를 입력하세요:");
//        for(int i = 0; i < n; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        int min = numbers[0];
//        int max = numbers[0];
//        for(int i = 1; i < n; i++) {
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.print("최대값 : " + max);
//        System.out.print("최소값 : " + min);

//        List<Integer> lottoArr = new ArrayList<>();
//        int tmp = 0;
//        while(true) {
//            tmp = ((int)(Math.random() * 45) +1);
//            if(!lottoArr.contains(tmp)) lottoArr.add(tmp);
//            if(lottoArr.size() == 6) break;
//        }
//        System.out.print(lottoArr);
        //ArrayList 물리적으로 연결되어 있다.
        //Vector는 쓰레드 환경을 지원한다. 멀티쓰레드 환경에서 동일 인덱스에 접근했을 때 락을 걸어주는게 벡터.
        //둘 다 삽입 삭제가 빈번한 환경에서는 사용을 권장하지 않는다.
        //한 곳에 데이터를 삽입하면 O(n)으로 인덱스가 뒤로 한칸씩 밀려나기 때문..


//        List<Integer> arr = new ArrayList<>();
//        System.out.print("임의의 정수 10개를 입력하세요. : ");
//        for(int i = 0; i < 10; i++) {
//            int num = sc.nextInt();
//            arr.add(num);
//        }
//        System.out.print("찾을 숫자를 입력하세요. : ");
//        int n = sc.nextInt();
//        카운트를 이용해서 첫번째 값이 나오면 카운트 ++하고 두번째 카운트의 값을 받으면 된다.

        //입력받은 수가 소수인지 아닌지 판별하기
        //소수? 1과 자기 자신 이외에는 나누어지지 않는 수
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.print(num + "은 소수 입니다.");
        } else {
            System.out.print(num + "은 소수가 아닙니다.");
        }

    }
    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
