package hackerRank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            for (int j = i + 1; j < 1000 - i; j++) {
                int k = 1000 - i - j;
                if(Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                    System.out.println("i : "+ i + ", j : " + j + ", k : " + k);
                    System.out.println(i * j * k);
                }
            }
        }



    }
}
