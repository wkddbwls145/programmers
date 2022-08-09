package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class noSameNum2 {
    static int[] solution(int []arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    arr[j] = -1;
                else break;
            }
        }

        return Arrays.stream(arr).filter(s->s!=-1).toArray();
    }

    public static void main(String[] args){
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }
}
