//package 스터디.Day6;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Day6_AsIThinkFirst {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        sc.nextLine();
//        String str = sc.nextLine();
//        printer(result(parser(str, N)));
//    }
//
//    public static List<Integer> parser(String str, int N) {
//        List<Integer> arr = new ArrayList<>();
//        String[] tmp = str.split(" ");
//        for(int i = 1; i <= N; i++) {
//            arr.add(Integer.parseInt(tmp[i-1]));
//        }
//        return arr;
//    }
//    public static List<Integer> result(List<Integer> parsedArr) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add()
//        for(int i = 1; i < parsedArr.size(); i++) {
//            if(parsedArr.get(i) > parsedArr.get(i-1)) arr.add(parsedArr.get(i));
//        }
//        return arr;
//    }
//    public static void printer(List<Integer> result) {
//        for(int x : result) {
//            System.out.print(x + " ");
//        }
//    }
//}
