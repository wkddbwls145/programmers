package level2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class eatTheGround {
    static int solution(int[][] land) {
        int answer = 0;

            int index =0;
            int i=0;
            for (int[] ia : land){
                if(i==0){
                    int bigNum = Arrays.stream(land[0]).max().getAsInt();
                    index = IntStream.range(0,land[0].length).filter(idn -> bigNum ==land[0][idn]).findFirst().orElse(-1);
                    answer += bigNum;
                    System.out.println("answer (초기) = " + answer);
                    System.out.println("index (초기 = " + index );
                    i +=1;
                    continue;
                }
                //0이면 index+1로만
                if(index == 0)
                    index = index+1;
                    //length-1이면 index-2로만 가능
                else if (index == ia.length-1)
                    index = index-1;
                    //중간이면 index-1또는 index+1에서 더 큰숫자로 갈 수 있음
                else
                    index = ia[index+1] > ia[index-1] ?  index+1 : index-1;

                System.out.println("index = " + index);
                System.out.println("land[i][index] = " + land[i][index]);
                answer += land[i][index];

                i +=1;
            }

        return answer;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(arr));
    }
}