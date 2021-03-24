package goorm;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫 줄에 배열의 크기 입력(최대 100)
        int arrSize = sc.nextInt();

        // 두번째 줄에 수열을 오름차순으로 정렬하여 입력
        String input = sc.nextLine();
        String[] output = input.split(" ");
        int[] arrInt = new int[output.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(output[i]);
        }

        // 출력하고 싶은 숫자를 입력
        int key = sc.nextInt();





    }

}
