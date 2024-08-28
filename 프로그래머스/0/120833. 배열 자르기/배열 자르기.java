import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
      // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);

        // 정수 배열을 return 하도록
        return answer;
    }
}