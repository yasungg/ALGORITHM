package 스터디.Day9.이진트리순회;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수를 입력받는다.
        Node[] nodeArr = new Node[N+1]; // 노드 배열의 크기는 N+1 왜냐하면 배열의 인덱스는 0부터 시작하지만 정점에는 1부터 입력하기 위해서.
        for(int i = 1; i <= N; i++) {
            Node binaryTree = new Node(i);
            nodeArr[i] = binaryTree;
        }
        for(int i = 1; i <= N; i++) {
            if(i * 2 <= N) {
                nodeArr[i].left = nodeArr[i * 2];
                nodeArr[i].right = nodeArr[(i * 2) + 1];
            }
        }
        preOrder(nodeArr[1]);
        System.out.println("");
        inOrder(nodeArr[1]);
        System.out.println("");
        postOrder(nodeArr[1]);
    }
    static void preOrder(Node node) {
        if(node != null) {
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    static void inOrder(Node node) {
        if(node != null) {
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
    }
    static void postOrder(Node node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data);
        }
    }
}
