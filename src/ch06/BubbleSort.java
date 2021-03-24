package ch06;

import goorm.StackTest;

import java.util.Scanner;

// 버블 정렬(버전1)
public class BubbleSort {
    //a[idx1]dhk a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
//    static void bubbleSort(int[] a, int n) {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = n - 1; j > i; j--) {
//                if(a[j-1] > a[j]) swap(a, j - 1, j);
//            }
//        }
//    }

    // 버블 정렬(버전2)
//    static void bubbleSort(int[] a, int n) {
//
//        for (int i = 0; i < n - 1; i++) {
//            int exchg = 0;                      // 패스의 교환 횟수를 기록합니다.
//            for (int j = n - 1; j > i; j--) {
//                if(a[j - 1] > a[j]) {
//                    swap(a, j - 1, j);
//                    exchg++;
//                }
//            }
//            if(exchg == 0) break;
//        }
//    }

    // 버블 정렬(버전3)
    static void bubbleSort(int[] a,int n) {
        int k = 0;          //a[k]보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            int last = n - 1;   //마지막으로 요소를 교환한 위치
            for (int j = n - 1; j > k; j--) {
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수 : ");
        int nx = sc.nextByte();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i +"] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }

    }
}
