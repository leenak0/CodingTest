//수박수박수박수박수박수?
//https://programmers.co.kr/learn/courses/30/lessons/12922

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++){
            if(i%2==0){//짝수이면
                answer += "수";//수 추가
            }else{//홀수이면
                answer += "박";//박 추가
            }
        }
        
        return answer;
    }
}