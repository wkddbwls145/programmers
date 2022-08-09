package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class noSameNum {
    static int[] solution(int []arr) {
        List<Integer> ia = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < ia.size(); i++) {
            while(true){
                if(i+1 == ia.size())
                    break;

                if(ia.get(i) == ia.get(i+1))
                    ia.remove(i+1);
                else
                    break;
            }
        }
        return ia.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }
}
