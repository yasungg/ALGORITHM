package 스터디.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day2_Studied {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력할 수의 개수 N과 구간합을 반복할 횟수 M을 차례로 입력하세요. : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] sum = new long[N+1];

        System.out.print("숫자열을 입력하세요. : ");
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < M; i++) {
            System.out.print(i+1 + "번째 " + "구간을 입력하세요. : ");
            st = new StringTokenizer(br.readLine());
            int min = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());
            System.out.println(sum[max] - sum[min - 1]);
        }
    }
}
