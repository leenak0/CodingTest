//두 개 뽑아서 더하기
//https://programmers.co.kr/learn/courses/30/lessons/68644

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                int n = numbers[i]+numbers[j];
                if (list.indexOf(n) < 0){
                	list.add(n);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
