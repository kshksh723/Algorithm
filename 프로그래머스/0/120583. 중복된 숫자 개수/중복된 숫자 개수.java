class Solution {
    public int solution(int[] array, int n) {
        int answer=0; // 변수를 0으로 초기화 
        
        for(int i=0; i< array.length; i++)
            if(array[i] == n){  //array[i] == 1가 같은지 
                answer++;
            }
        return answer;
    }
}