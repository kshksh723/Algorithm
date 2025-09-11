import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 1. 배열을 오름차순으로 정렬합니다.
        Arrays.sort(numbers);
        
        // 2. 정렬된 배열에서 가장 큰 두 원소를 곱합니다.
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        // 3. 최댓값을 반환합니다.
        return answer;
    }
}