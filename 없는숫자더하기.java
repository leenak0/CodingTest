//없는 숫자 더하기
//https://programmers.co.kr/learn/courses/30/lessons/86051

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;//정답
        int sum = 0;//numbers의 합
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];//numbers의 모든 수를 더함
        }
        
        answer = 45-sum;//답은 45에서 합을 뺀것
        
        return answer;
    }
}
