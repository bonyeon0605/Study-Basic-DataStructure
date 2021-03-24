package goorm;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // 배열의 숫자 개수
        int num = sc.nextInt();
        sc.nextLine();
        // 배열의 수 입력
        String input = sc.nextLine();
        String[] tt = input.split(" ");

        // 합을 구하고자 하는 구간
        String input2 = sc.nextLine();
        String[] tt2 = input2.split(" ");

        int num1 = Integer.parseInt(tt2[0]);
        int num2 = Integer.parseInt(tt2[1]);

        for (int i = num1; i <= num2; i++) {
            sum += Integer.parseInt(tt[i -1]);
        }

        System.out.println(sum);
    }
}
