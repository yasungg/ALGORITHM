package 스터디.Day9.재귀함수활용이진수출력;

public class Main {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }
    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        Main T = new Main();
        T.solution(11);
        //System.out.println(T.solution(3));
    }
}
