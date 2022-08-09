package level1;

public class kim {
    public String solution(String[] seoul) {
        String answer = "";
        int i;
        for (i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim"))
                break;
        }
        return "김서방은 "+i+"에 있다";
    }
}
