package level1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class sortWill {
    static String[] solution(String[] strings, int n) {
        String[] ssa = Arrays.stream(strings).sorted().toArray(String[]::new);
        String[] answer = new String[strings.length];
        AtomicInteger index = new AtomicInteger();
        Object[] copy = Arrays.stream(ssa).map(m->m.charAt(n)+" "+index.getAndIncrement() ).sorted().toArray();

        int i=0;
        for(Object o : copy) {
            String[] sa = String.valueOf(o).split(" ");
            answer[i] = ssa[Integer.valueOf(sa[1])];
            i++;
        }

        return answer;
    }

    public static void main(String[] args){
        String[] a = {"ada","abce", "abcd"};

        System.out.println(solution(a,2));
    }
}
