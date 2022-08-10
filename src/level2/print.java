package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class print {
    static int solution(int[] priorities, int location) {
        Queue<Pair> queue = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            System.out.println("i = " + i + " priorites[i] = " + priorities[i]);
            queue.add(new Pair(i, priorities[i]));
        }

        while (!queue.isEmpty()) {

            int current = queue.peek().value;
            System.out.println("current = " + current);

            boolean flag = false;

            for (Pair pair : queue) {
                if (pair.value > current) {
                    // System.out.println(pair.value);
                    flag = true;
                    break;
                }
            }

            if (flag) {
                Pair temp = queue.poll();
                queue.add(temp);
                System.out.println("temp = "+ temp.index + "  " + temp.value);
            }
            else {
                answer++;
                Pair pair = queue.poll();

                if (pair.index == location) {
                    return answer;
                }
            }
        }

        return answer;
    }

    static class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,1,3,2};
        int location = 2;
        //1

//        int[] arr = {1,1,9,1,1,1};
//        int location = 0;
        //5

        System.out.println(solution(arr, location));
    }
}
