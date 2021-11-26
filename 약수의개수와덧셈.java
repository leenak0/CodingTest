//약수의 개수와 덧셈
//https://programmers.co.kr/learn/courses/30/lessons/77884

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int cnt = 0;//약수의 개수
            for(int j=1; j<=i; j++){
                if(i%j==0){//나눈 나머지가 0이면
                    cnt++;//약수
                }
            }
            if(cnt%2==0){//약수가 짝수면
                answer+=i;//더하고
            }else{
                answer-=i;//홀수면 뺀다
            }
        }
        
        return answer;
    }
}
