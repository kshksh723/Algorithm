import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
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
    }
}



/*
solution 도출하기 
- Sorting/ Loop을 활용한 solution
- Hash를 활용한 solution

마라톤에 참여한 선수의 배열 participant고, 완주한 선수들의 이름이 담긴 배열은 completion이다 

왜 sorting을 하는 것인지 

*/