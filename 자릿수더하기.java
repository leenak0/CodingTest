//자릿수 더하기
//https://programmers.co.kr/learn/courses/30/lessons/12931

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n!=0){//n이 0이 아니면//987//98//9
            answer += n%10;//1의자리수 더하기//+7//+8//+9
            n/=10;//10으로 나누기//98//9
        }
        
        return answer;//7+8+9=24
    }
}
