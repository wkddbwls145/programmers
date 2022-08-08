public class squared {
    static long solution(long n) {
        int answer = (int) Math.sqrt(n);
        if(answer!= 1 && n % answer == 0) {
            answer += 1;
            answer *= answer;
        }else
            return -1;

        return Long.valueOf(answer);
    }

    public static void main(String[] args){
        System.out.println(solution(121));
    }
}
