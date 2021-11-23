//문자열 내 마음대로 정렬하기
//https://programmers.co.kr/learn/courses/30/lessons/12915

#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    for (int i = 0; i < strings.size(); i++)
    {
        for (int j = i+1; j <= strings.size()-1; j++)
        {
            if (strings[i][n]>strings[j][n])//n번째 문자끼리 비교
            {
                strings[i].swap(strings[j]);//자리바꾸기
            }
            else if (strings[i][n] == strings[j][n] && strings[i]>strings[j])//문자가 같을때는 단어끼리 비교
            {
                strings[i].swap(strings[j]);//자리바꾸기
            }
 
        }
    }
    return strings;
}
