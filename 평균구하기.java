//평균 구하기
//https://programmers.co.kr/learn/courses/30/lessons/12944

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++){
            answer+=arr[i];//arr의 모든 수를 더함
        }
        
        answer/=arr.length;//arr의 길이로 나눔
        
        return answer;
    }
}
