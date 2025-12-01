import java.util.*;
class Solution {
    public int solution(int[] sides) {
        
        int answer = 0;
        
        Arrays.sort(sides); //  정렬 해두고 큰 거 
        // 삼각형이니까 3개..라고 생각하기
         
        if(sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
        
    }
}