package 스터디.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int x : result(str)) {
            System.out.print(x + " ");
        }
    }
    public static List<Integer> result(String str) {
        List<Integer> arr = parser(str);
        List<Integer> rst = new ArrayList<>();
        for(int x : arr) {
            if(isPrime(x)) rst.add(x);
        }
        return rst;
    }
    public static List<Integer> parser(String str) {
        List<Integer> rst = new ArrayList<>();
        String par = new StringBuilder(str).reverse().toString();
        String[] strArr = par.split(" ");

        for(int i = 0; i < strArr.length; i++) {
            rst.add(Integer.parseInt(strArr[i]));
        }
        return rst;
    }
    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i =2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
