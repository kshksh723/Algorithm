class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;  // 더 해준 원소들의 합을 return 해줄 변수 선언 
        for(int i=0; i < numbers.length; i++){
           answer += numbers[i];
            if(answer > n){
                // 원소를 앞에서 하나씩 더하다 그 합이 n 보다 커지는 순간
                return answer;
            }
        }
        return answer;
    }
}