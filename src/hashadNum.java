import java.lang.reflect.Array;
import java.util.Arrays;

public class hashadNum {

    static boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        char[] c= String.valueOf(x).toCharArray();
        for(char cc : c)
            num += Integer.valueOf(String.valueOf(cc));
        if(x%num != 0)
            answer = false;

        return answer;
    }

    public static void main(String[] args){
        solution(12);
    }
}
