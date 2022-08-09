package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscNum {
    static long solution(long n) {
        String answer = "";
        List<Long> l = new ArrayList<>();
        while(n > 0 ){
            Long a = n%10;
            l.add(Long.valueOf(a));
            n /= 10;
        }
        Collections.sort(l, Collections.reverseOrder());

        for (Long ll : l)
            answer = answer+ll;

        return Long.valueOf(answer);
    }

    public static void main(String[] args){
        System.out.println(solution(118372));
    }
}
