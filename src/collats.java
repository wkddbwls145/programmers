public class collats {
    static int solution(int num) {
        int answer = 0;
        Long l = (long) num;

        if(num == 1)
            return 0;

        while(true) {
            if (l ==1)
                break;

            if (answer ==500)
                return -1;

            if (l % 2 == 0)
                l /= 2;
            else
                l = l * 3 + 1;

            answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(626331));
    }
}
