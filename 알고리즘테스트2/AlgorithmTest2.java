package 알고리즘테스트2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgorithmTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이와 비교할 정수를 한 칸 띄워 입력하세요. ex)N X : ");
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        System.out.println("비교 대상 정수 X : " + numbers[1]);
        System.out.print("배열에 들어갈 " + numbers[0] + "개의 정수를 한 칸씩 띄워 입력하세요. : ");
        String arrayNum = sc.nextLine();
        String[] inputNumArr = arrayNum.split(" ");
        int[] arr = new int[numbers[0]];
        List<Integer> rst = new ArrayList<>();
        for(int i = 0; i < numbers[0]; i++) {
            arr[i] = Integer.parseInt(inputNumArr[i]);
            if(arr[i] > numbers[1]) {
                rst.add(arr[i]);
            }
        }
        for(int num : rst) {
            System.out.print(num + " ");
        }

    }
}
