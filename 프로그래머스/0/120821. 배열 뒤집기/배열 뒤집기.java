class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; // 거꾸로 담을 새로운 배열
        
        // num_list의 요소를 뒤집어서 answer에 저장
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - 1 - i];
        }
        return answer;
    }
}