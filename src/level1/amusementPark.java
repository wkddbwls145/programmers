package level1;

public class amusementPark {
    static long solution(int price, int money, int count) {
        long requireM=0;
        for (int i = 0; i < count; i++)
            requireM  = requireM + (i+1)*price;

        return requireM <= money ? 0: requireM-money;
    }

    public static void main(String[] args){
        System.out.println(solution(3,30,4));
    }
}
