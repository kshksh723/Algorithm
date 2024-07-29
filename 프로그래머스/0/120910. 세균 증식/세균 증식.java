class Solution {
    public int solution(int n, int t) {
    // 처음 세균 값을 받을 변수 초기화
        int answer = n;
        for(int i = 0; i < t; i++){
            answer *=2;
        }
    return answer;
    }
}