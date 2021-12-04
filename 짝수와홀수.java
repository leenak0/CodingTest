//짝수와 홀수
//https://programmers.co.kr/learn/courses/30/lessons/12937

class Solution {
    public String solution(int num) {
        String answer = "";
        
        if(num%2==0){//짝수이면
            answer += "Even";//Even 출력
        }else{//홀수이면
            answer += "Odd";//Odd 출력
        }
        
        return answer;
    }
}
