package level1;

public class watermelon {
    static String solution(int n) {
        String s= "수";
        String s2="박";
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(i==0 || i%2==0)
                answer+=s;
            else
                answer+=s2;
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(5));
    }
}
