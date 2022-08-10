package level2;

import java.util.*;

public class functionDevelop {
    static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> l = new ArrayList<>();
        List<Integer> ll = new ArrayList<>(); // 일수

        for (int i = 0; i < progresses.length; i++)
            l.add((int)Math.ceil((double)(100-progresses[i])/speeds[i]));

        for (int a : l)
            System.out.println(a);

        int distributeNum =1;
        int bigNum = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if(bigNum >= l.get(i))
                distributeNum+=1;
            else {
                ll.add(distributeNum);
                bigNum = l.get(i);
                distributeNum = 1;
            }

            if(i+1 == l.size())
                ll.add(distributeNum);
        }

        for(int t : ll)
            System.out.println(t);

        return ll.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            System.out.println("date = " + date);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
            System.out.println(answerList.get(i));
        }

        return answer;
    }

    public static void main(String[] args){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1,30,5};

        solution2(progresses, speeds);
    }
}
