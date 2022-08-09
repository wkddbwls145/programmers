package level1;

public class strangeString2 {
    static String solution(String s) {
        String[] sa = s.split(" ");
        for (String ss: sa){
            ss = ss.toUpperCase();
            for (int i = 1; i < ss.length(); i++) {
//                if(i % 2 != 0)


            }
        }
        return "2";
    }

    public static void main(String[] args){
        System.out.println(solution("try hello world"));
    }
}
