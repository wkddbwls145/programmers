package level1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    static int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        for(String s : list){
            System.out.println(s);
        }
        //신고당한놈, 횟수
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }
        int[] answer = Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            System.out.println("_user = " + _user);
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            //int reportListNew = reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
            //List<Long> a =  reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();

        return answer;
    }

         //확인용 메인 메서드
     public static void main(String[] args){
         String[] id_list = {"muzi", "frodo", "apeach", "neo"};
         String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
         int k = 3;

         solution(id_list, report, k);
     }
}