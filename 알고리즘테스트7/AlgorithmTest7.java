package 알고리즘테스트7;

import java.util.Scanner;

//Quadrant n 구하기
public class AlgorithmTest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X 축 : ");
        int x = sc.nextInt();
        System.out.print("Y 축 : ");
        int y = sc.nextInt();
        printer(whatQuadrant(x, y));
    }
    static int whatQuadrant(int x, int y) {
        if(x > 0 && y > 0) {
            return 1;
        } else if(x < 0 && y > 0) {
            return 2;
        } else if(x < 0 && y < 0) {
            return 3;
        } else if(x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    static void printer(int quadrant) {
        if(quadrant > 0) {
            System.out.print(quadrant + "사분면 입니다.");
        } else if(quadrant == 0) {
            System.out.print("x, y값은 원점에 위치해 있습니다.");
        }
    }
}
