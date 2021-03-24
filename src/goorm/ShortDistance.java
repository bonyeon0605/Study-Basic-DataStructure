package goorm;

import java.util.Arrays;
import java.util.Scanner;

public class ShortDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] box = new int[size];
        sc.nextLine();
        String num = sc.nextLine();
        String[] nums = num.split(" ");

        for (int i = 0; i < size; i++) {
            box[i] = Integer.parseInt(nums[i]);
            System.out.println(box[i]);
        }
        int[] tmp = new int[size - 1];
        for (int i = 1; i < box.length; i++) {
            tmp[i - 1] = (box[i] - box[i - 1]);

        }
        Arrays.sort(tmp);
        System.out.println(tmp[0]);


    }
}
