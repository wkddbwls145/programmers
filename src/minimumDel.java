import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class minimumDel {
    static int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        return Arrays.stream(arr).filter(s-> s!= Arrays.stream(arr).min().getAsInt()).toArray();

    }

    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        System.out.println(solution(arr));
    }
}
