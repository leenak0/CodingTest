//2016년
//https://programmers.co.kr/learn/courses/30/lessons/12901

import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate date = LocalDate.of(2016,a,b);//LocalDate 생성
        DayOfWeek day = date.getDayOfWeek();//DayOfWeek 객체 구하기
        answer = (day.getDisplayName(TextStyle.SHORT, Locale.US)).toUpperCase();//텍스트 요일 구하기//대문자로 변환
        
        return answer;
    }
}