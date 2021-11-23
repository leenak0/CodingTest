//행렬의 덧셈
//https://programmers.co.kr/learn/courses/30/lessons/12950

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];//총 몇 칸인지//한 칸 안에 숫자 몇개 있는지
        
        for(int i=0; i<arr1.length; i++){//i번째 칸
            for(int j=0; j<arr1[i].length; j++){//j번째 숫자
                answer[i][j] = arr1[i][j]+arr2[i][j];//더해서 집어넣음
            }
        }
        return answer;
    }
}
