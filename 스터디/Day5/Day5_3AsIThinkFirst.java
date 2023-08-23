package 스터디.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day5_3AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tmp = str.split(" ");
        for(int i : result(tmp[0], tmp[1])) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] result(String s, String t) {
        char[] charArr = s.toCharArray();
        List<Integer> tindex = new ArrayList<>();
        int[] rangeArr = new int[charArr.length];
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == t.charAt(0)) tindex.add(i);
        }
        for(int i = 0; i < charArr.length; i++) {
            int min = charArr.length;
            for(int j = 0; j < tindex.size(); j++) {
                int range = Math.abs(i - tindex.get(j));
                if(range > 0 && min > range) min = range;
                else if(range == 0) min = 0;
            }
            rangeArr[i] = min;
        }
        return rangeArr;
    }
}
