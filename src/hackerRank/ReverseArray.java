package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();
        sc.nextLine();
        String arrStr = sc.nextLine();
        String[] arrSt = arrStr.split(" ");
        int[] arr = new int[arrSt.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrSt[i]);
        }

        for(int i = 0 ; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void swap(int[] a, int b, int c) {
        int t = a[b];
        a[b] = a[c];
        a[c] = t;
    }
}
