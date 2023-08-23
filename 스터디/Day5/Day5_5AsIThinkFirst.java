package 스터디.Day5;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day5_5AsIThinkFirst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.print(result(num, str));
    }
    public static String result(int num, String str) {
        String rst = "";
        String[] arr = new String[num];
        String ext = "";
        int[] binaryArr = new int[num];
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '#') ext += "1";
            else if(str.charAt(i) == '*') ext += "0";
        }
        for(int i = 0; i < num; i++) {
            arr[i] = ext.substring(0, 7);
            ext = ext.substring(7);
        }
        for(int i = 0; i < arr.length; i++) {
            binaryArr[i] = Integer.parseInt(arr[i], 2);
            rst += Character.toString(binaryArr[i]);
        }
        return rst;
    }
}
