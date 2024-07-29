import java.util.Arrays;

class Solution {
   public static int solution(int[] array) {
        int answer = 0;
         // 순서대로 정렬
        Arrays.sort(array);
        answer = array[array.length / 2]; // 중앙값 찾기 
        return answer;
    }
}