package sample;

import java.util.*;

public class test1 {
    static int[][] test(int[][] arr){
        Stack<a> stack = new Stack<>();
        Arrays.sort(arr, (o1, o2) -> {
            return o1[0]-o2[0];
        });

        List<a> l = new ArrayList<>();
        for (int[] a : arr)
            l.add(new a(a[0], a[1] - a[0]));

        for (int i = 0; i < l.size()-1; i++) {
            int sumA = l.get(i).start + l.get(i).betweenNum;
            int nextStartNum=l.get(i+1).start;
            int sumB = nextStartNum + l.get(i+1).betweenNum;
            if(sumA > nextStartNum){
                if(sumA >= sumB) 
                    stack.push(new a(l.get(i).start, sumA));
                else {
                    stack.pop();
                    stack.push(new a(l.get(i).start, sumB));
                }
            }else
                stack.push(new a(l.get(i).start, sumA));
        }
        int[][] answer = new int[stack.size()][2];

        for (int i = stack.size()-1; i >= 0; i--) {
            a aReulst = stack.pop();
            answer[i] = new int[]{aReulst.start, aReulst.betweenNum};
        }

        return  answer;
    }

    static class a{
        int start;
        int betweenNum;

        public a (int start, int betweenNum){
            this.start = start;
            this.betweenNum = betweenNum;
        }
    }

    public static void main(String[] args){
        int arr[][] = {{1, 3}, {5, 8}, {4, 10}, {20, 25},{22,27}};
        System.out.println(test(arr));

    }
}
