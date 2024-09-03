class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2; // n 이하의 홀수 개수 계산
        int[] answer = new int[size]; // 결과를 담을 배열
        int k = 0;
        
        for(int i = 1; i <= n; i += 2){
            // 1부터 시작해 2씩 증가
            answer[k] = i;
            k++;
        }
        return answer;
    }
}