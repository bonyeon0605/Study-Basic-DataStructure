package programmers;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};

        int[][] com = {{2,5,3}, {4,4,1}, {1,7,3}};

        int[] a = solution(arr,com);
        System.out.println(Arrays.toString(a));
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tmp = new int[3];

        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < commands[i].length; j++) {
                tmp[j] = commands[i][j];
            }

            int[] temp = Arrays.copyOfRange(array, tmp[0] - 1, tmp[1] );
            Arrays.sort(temp);

            answer[i] = temp[tmp[2] - 1];
        }

        return answer;
    }
}
