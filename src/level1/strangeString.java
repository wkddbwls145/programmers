package level1;

import java.util.Arrays;
import java.util.Locale;

public class strangeString {
    static String solution(String s) {
        String answer = "";
        String[] sa = s.split(" ");
        for(int i=0; i<sa.length;i++){
            String result ="";
            sa[i] = sa[i].toUpperCase();
            String[] sna = sa[i].split("");

            for(int j=1; j<sna.length; j++)
                if(j %2 != 0)
                    sna[j] = sna[j].toLowerCase();

            for (String ss : sna)
                result += ss;

            sa[i] = result;
        }

        for (String aaaa : sa)
            answer+= aaaa+" ";

        //answer = answer.substring(0, answer.length()-1);
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("try hello world"));
    }
}
