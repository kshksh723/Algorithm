class Solution {
    public int solution(int n) {
        int answer = 0;
        // 피자 7조각 잘라줌
        //7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요함 
        // .........7조각이 있는데 15명이 한조각 씩 먹으면 7,7 14   ,7       -3333
       if(n%7 == 0){
           answer = n/7; 
       } else {
           answer = n/7 + 1;
       }
        return answer;
    }
}