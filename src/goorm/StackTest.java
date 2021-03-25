package goorm;

import java.util.*;

public class StackTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int tt = sc.nextInt();
            if(tt == 0) { //푸시 저장
                int n1 = sc.nextInt();
                st.push(n1);
            } else if(tt == 1) { // 팝 꺼내기
                if(st.isEmpty()) {
                    System.out.println("underflow");
                }else{
                    st.pop();
                }
            } else {
                break;
            }
        }
        while (!st.isEmpty()) {
            list.add(String.valueOf(st.pop()));
        }

        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
