package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class naturalNumAscArray {
    static int[] solution(long n){
       int[] a= Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::new).toArray();
       int[] na = new int[a.length];
       for(int i=0;i<a.length;i++)
           na[i] = a[(a.length-1)-i];
       return na;
    }

    public static void main(String[] args){
        int[] result = solution(764892);
        for (int i : result)
            System.out.print(i);
    }
}
