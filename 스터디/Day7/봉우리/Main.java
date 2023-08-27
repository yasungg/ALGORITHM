package 스터디.Day7.봉우리;

import java.util.Scanner;

public class Main {
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {-1, 0, 1, 0};

    public static void main(String[] args) {
        long sTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] numArr = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j =0; j < N; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }
        System.out.print(result(N, numArr) + " ");
        Double sec = (System.currentTimeMillis() - sTime) / 1000.0;
        System.out.printf("소요시간 --- (%.2f초)%n", sec);
    }
    public static int result(int N, int[][] numArr) {
        int rst = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < N && ny >= 0 && ny < N && numArr[nx][ny] >= numArr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) rst++;
            }
        }
        return rst;
    }
}
