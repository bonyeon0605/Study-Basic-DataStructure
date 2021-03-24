package ch06;

import ch04.IntStack;

public class QuickSort2 {
    static void quickSort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true) {
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = a[(pl + pr) / 2];

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if(pl <= pr) {
                    QuickSort.swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if(left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }
            if(pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }
}
