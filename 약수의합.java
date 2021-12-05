//약수의 합
//https://programmers.co.kr/learn/courses/30/lessons/12928

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n!=0){//n이 0이 아닐때
            for(int i=1; i<=n; i++){
                if(n%i==0){//i로 나눈 나머지가 0이면
                    answer+=i;//약수이므로 더한다
                }
            }
        }
        
        return answer;
    }
}
