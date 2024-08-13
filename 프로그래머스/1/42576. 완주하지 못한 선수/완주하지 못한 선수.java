import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
      /* 
      ✅ sorting해서 문제 풀기 
      String answer = "";
        // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion); // 두 배열이 알파벳 순서대로 되어있다는 것을 알 수 있다
 
        // 2. 두 배열이 다를 때까지 찾는다
        int i = 0;
        for(;i< completion.length; i++ )
            if(!participant[i].equals(completion[i]))
                break;
        
        // 마지막 선수 완주하지 못한 선수가 완주하지 못한 선수이기 때문에 예외처리를 해야한다 
        // 3. 여기까지 왔다면 마지막 주자가 완주하지 못한 선수다
     
        return participant[i];
        
        */
//         해시로 문제 풀기
        String answer = "";
        // 1, HashMap을 만든다 (participant)
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        // 2. HashMap을 뺀다(completion)
        for(String player : completion)
            map.put(player, map.get(player) - 1); 
        // 3. value가 0이 아닌 마지막 주자를 찾는다
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break; 
            }
        }
        return answer;
    }
}

/*
getOrDefault
-  찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
 
출처: https://junghn.tistory.com/entry/JAVA-Map-getOrDefault-이란-사용법-및-예제 [코딩 시그널:티스토리]
getOrDefault(Object key, V DefaultValue)
매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.

key : 값을 가져와야 하는 요소의 키입니다.
defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.

반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환됩니다

*/

/*
solution 도출하기 
- Sorting/ Loop을 활용한 solution
- Hash를 활용한 solution

마라톤에 참여한 선수의 배열 participant고, 완주한 선수들의 이름이 담긴 배열은 completion이다 


*/