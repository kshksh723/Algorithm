import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 1. 숫자가 아닌 문자(a-z)를 모두 제거합니다.
        // [^0-9]는 "0부터 9가 아닌 것"이라는 뜻입니다.
        String digitOnly = my_string.replaceAll("[^0-9]", "");
        
        // 2. 결과 배열의 크기를 추출한 숫자의 개수만큼 정합니다.
        int[] answer = new int[digitOnly.length()];
        
        // 3. 문자열에서 한 글자씩 꺼내 숫자로 바꿔 배열에 담습니다.
        for (int i = 0; i < digitOnly.length(); i++) {
            // Character.getNumericValue를 쓰면 문자 '1'을 숫자 1로 쉽게 바꿀 수 있습니다.
            answer[i] = Character.getNumericValue(digitOnly.charAt(i));
        }
        
        // 4. 오름차순으로 정렬합니다.
        Arrays.sort(answer);
        
        return answer;
    }
}