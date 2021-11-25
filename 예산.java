//예산
//https://programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;//최대 개수
        Arrays.sort(d); //신청금액 정렬
        int sum = 0;//신청금액 합산
        
        for(int i=0; i<d.length; i++){
            if(sum+d[i]<=budget){//신청금액 작은것부터 더함//예산보다 작거나 같으면
                sum += d[i];//합산에 더하고
                answer += 1;//개수 추가
            }else{
                break;
            }
        }
        
        return answer;
    }
}
