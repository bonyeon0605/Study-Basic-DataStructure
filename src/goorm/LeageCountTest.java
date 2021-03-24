package goorm;

import java.util.Scanner;

public class LeageCountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int total = 0;
        for (int i = 0; i < cnt; i++) {
            total += i;
        }

        System.out.println(total);
    }
}
