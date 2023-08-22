package 스터디.Day4;

import java.util.*;

public class Day4_3AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(result(str));
    }

    public static String result(String str) {
        List<String> strArr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()) {
            strArr.add(st.nextToken());
        }
        String max = "";
        for(int i = 0; i < strArr.size(); i++) {
            max = strArr.get(0);
            if(max.length() < strArr.get(i).length()) {
                max = strArr.get(i);
            }
        }
        return max;
    }
}
