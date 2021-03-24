package goorm;

import java.util.ArrayDeque;
import java.util.Queue;

public class BridgeTruck {
    public static void main(String[] args) {
        int bride = 2;
        int weight = 10;
        int[] truck = {7,4,5,6};

        int result = solution(bride, weight, truck);
        System.out.println(result);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new ArrayDeque<>();

        for (int i = 0; i < bridge_length - 1; i++) {
            bridge.add(0);
        }

        int currentWeight = truck_weights[0];
        bridge.add(currentWeight);
        int index = 1;
        int answer = 1;

        while (!bridge.isEmpty()) {
            answer++;
            int truck = bridge.poll();
            currentWeight -= truck;
            System.out.println(currentWeight);
            if(index < truck_weights.length) {
                if(currentWeight + truck_weights[index] <= weight) {
                    currentWeight += truck_weights[index];
                    bridge.add(truck_weights[index++]);
                } else {
                    bridge.add(0);
                }
            }
        }

        return answer;
    }
}
