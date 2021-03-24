package goorm;

import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        String[] numsArr = nums.split(" ");

        int min = Integer.parseInt(numsArr[0]);
        for (int i = 1; i < numsArr.length; i ++) {
            System.out.println(numsArr[i]);
            if(min > Integer.parseInt(numsArr[i])) {
                min = Integer.parseInt(numsArr[i]);
            }
        }

        System.out.println("답 : " + min);
    }
}
