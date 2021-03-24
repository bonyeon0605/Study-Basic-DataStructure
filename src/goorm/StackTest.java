package goorm;

import java.util.*;

public class StackTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("데이터 입력 횟수 : " );
        int num = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int tt = sc.nextInt();
            if(tt == 0) { //푸시 저장
                int n1 = sc.nextInt();
                st.push(n1);
                list.add(String.valueOf(n1));
            } else if(tt == 1 && st.isEmpty()) { // 팝 꺼내기
                list.add("underflow");
            } else {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
