package 알고리즘테스트4;
//임의의 수 10개가 주어졌을 때 오름차순 정렬하기.(버블정렬)
public class AlgorithmTest4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 53, 27, 42, 96, 127, 11, 35, 67};
        int tmp = 0; // 값을 복사하기 전 임시 저장공간
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
