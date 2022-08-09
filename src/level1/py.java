package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class py {
   static boolean solution(String s) {
        String[] sa = s.toLowerCase().split("");

       List<String> p = Arrays.stream(sa).filter(a-> a.equals("p")).collect(Collectors.toList());
       List<String> y = Arrays.stream(sa).filter(a-> a.equals("y")).collect(Collectors.toList());

       System.out.println(p.size());
       System.out.println(y.size());
        return p.size() == y.size() ? true: false;
    }
    public static void main(String[] args){
        System.out.println(solution("pPoooyY"));
    }
}
