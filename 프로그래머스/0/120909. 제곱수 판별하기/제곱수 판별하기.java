class Solution {
    public int solution(int n) { 
        // 144
        int answer = 0;
    // 제곱근 구하기
        if(Math.sqrt(n) % 1 == 0) {
            answer =  1;
        } else {
            answer =  2;
        }
        return answer;
    }
}