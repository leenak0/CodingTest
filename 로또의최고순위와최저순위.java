//로또의 최고 순위와 최저 순위
//https://programmers.co.kr/learn/courses/30/lessons/77484

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int x=0;//모르는 숫자 개수
        int y=0;//일단 로또 맞은 개수
        int max;//최고 순위
        int min;//최저 순위
        
		for (int i=0; i<6; i++){
            if(lottos[i] == 0){
                x++; //0 찾아서 모르는 숫자 셈
            }else{
                for (int a=0; a<6; a++){
                    if(lottos[i] == win_nums[a])
                        y++; //일단 맞춘거 숫자 셈
                }
            }
        }
        
        max = getRank(x+y); //최고순위는 모르는거 다 맞았을때
        min = getRank(y); //최저순위는 다 틀렸을때
        
        int[] answer = {max, min}; //최고순위, 최저순위
        
        return answer;
    }
    
    public int getRank(int n){ //맞춘 숫자 비교해서 순위 정하는 함수
        switch(n){
            case 2 : return 5;
            case 3 : return 4;
            case 4 : return 3;
            case 5 : return 2;
            case 6 : return 1;
            default: return 6;
        }
    }
}
