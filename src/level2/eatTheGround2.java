package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class eatTheGround2 {
    static int solution(int[][] land) {
        int answer = 0;
        int index =0;
        List<Integer> il = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            int i=0;
            answer = 0;
            for (int[] ia : land){
                if(i==0){
                    int bigNum = ia[j];
                    System.out.println("bigNum = " +bigNum);
                    index = IntStream.range(0,land[0].length).filter(idn -> bigNum ==land[0][idn]).findFirst().orElse(-1);
                    answer += bigNum;
                    i +=1;
                    continue;
                }
                ia[index] = -1;
                System.out.println("Arrays.stream(ia).max().getAsInt() = " + Arrays.stream(ia).max().getAsInt());
                answer += Arrays.stream(ia).max().getAsInt();
                i +=1;
            }
            il.add(answer);
        }
        return answer;
    }

    public static void main(String[] args){
        int[][] arr = {{4,3,2,1},{2,2,2,1},{6,6,6,4},{8,7,6,5}};
        System.out.println(solution(arr));
    }
}