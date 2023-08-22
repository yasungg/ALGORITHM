package 스터디.Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4_4AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            strArr[i] = sc.next();
        }
        for (String rst : result(strArr)) {
            System.out.println(rst);
        }
    }
    public static List<String> result(String[] strArr) {
        List<String> rstArr = new ArrayList<>();
        for(String rst : strArr) {
            String tmp = new StringBuilder(rst).reverse().toString();
            rstArr.add(tmp);
        }
        return rstArr;
    }

}
