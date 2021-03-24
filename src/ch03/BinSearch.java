package ch03;

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;         // 검색할 범위의 첫 인덱스
        int pr = n -1;      // 검색할 범위의 끝 인덱스

        do{
            int pc = (pl + pr) / 2;     // 중앙 요소의 인덱스
            if(a[pc] == key) {
                return pc;              // 검색 성공!
            }else if(a[pc] < key) {
                pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 줄임
            }else {
                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 줄임
            }
        } while (pl <= pr);

        return -1;      // 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do{
                System.out.print("x["+i+"] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }



    }
}
