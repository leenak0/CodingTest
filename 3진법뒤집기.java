//3진법 뒤집기
//https://programmers.co.kr/learn/courses/30/lessons/68935

class Solution {
    public int solution(int n) {
        String answer = "";
        
        while(n>=3) {//3보다 같거나 클때
            answer += n%3;//3으로 나눈 나머지를 계속 붙여준다
            n /=3 ;//n을 3으로 나눔
        }
        answer += n;
        
        return Integer.parseInt(answer,3);
    }
}