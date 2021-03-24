package ch05;

import java.util.Scanner;

public class Recur {
    static void recur(int n) {
        // 재귀 함수
        if(n > 0) {
            recur(n-1);
            System.out.print(n + " ");
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur(x);
    }
}
