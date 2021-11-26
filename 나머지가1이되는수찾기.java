//나머지가 1이 되는 수 찾기
//https://programmers.co.kr/learn/courses/30/lessons/87389

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n; i++){//1부터 n-1까지의 수를 차례대로 나눈다
            if(n%i==1){//나눠서 1이 남는 수를 찾는다
                answer=i;
                break;
            }
        }
        
        return answer;
    }
}
