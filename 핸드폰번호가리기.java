//핸드폰 번호 가리기
//https://programmers.co.kr/learn/courses/30/lessons/12948

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //뒤 4자리 뺀 수만큼 *입력
        for(int i=0; i<phone_number.length()-4; i++){
            answer+="*";
        }
        //전화번호 뒤에서 4번째부터 끝까지 문자열 자르기, 문자열 더하기
        answer+=phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return answer;
    }
}
