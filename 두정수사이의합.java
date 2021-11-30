//두 정수 사이의 합
//https://programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a<b){//b가 a보다 크면
            for(int i=a; i<=b; i++){
                answer+=i;//a부터 b까지 더함
            }
        }else{//아니면
            for(int i=b; i<=a; i++){
                answer+=i;//b부터 a까지 더함
            }
        }
        
        return answer;
    }
}
