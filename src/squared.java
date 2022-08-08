public class squared {
    static long solution(long n) {
        double answer = Math.sqrt(n);
        long answer2 = (long) Math.sqrt(n);

        if(answer-answer2 != 0)
            return-1;
        else{
            answer2 += 1;
            answer2 *= answer2;
        }
        return answer2;
    }

    public static void main(String[] args){
        System.out.println(solution(1));
    }
}
