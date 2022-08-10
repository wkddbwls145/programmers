package level2;

import java.util.LinkedList;
import java.util.Queue;

public class bracket {
    static boolean solution(String s) {
        Queue<String> que = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            if(que.peek() == null) {
                que.offer(a);
                if(que.peek().equals(")"))
                    return false;
                continue;
            }
            if(que.peek().equals(a))
                que.offer(a);
            else
                que.poll();
        }

        return que.poll() == null ? true : false;
    }

    public static void main(String[] args){
        System.out.println(solution("()()"));
    }
}
