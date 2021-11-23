//음양 더하기
//https://programmers.co.kr/learn/courses/30/lessons/76501

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==true)//양수면
                answer += absolutes[i];//더하고
            else
                answer -= absolutes[i];//음수면뺀다
        }
        
        return answer;
    }
}
