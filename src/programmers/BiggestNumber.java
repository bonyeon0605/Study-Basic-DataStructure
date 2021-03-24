package programmers;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] nums = {6,10,2};

        String t = solution(nums);
        System.out.println(t);
    }

    static String solution(int[] numbers) {
        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        System.out.println(Arrays.toString(result));
        if(result[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (String a : result) {
            answer += a;
        }

        return answer;
    }
}
