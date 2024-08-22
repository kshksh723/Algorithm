

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다
    // 스택을 이용해서 풀어야 함
    // 왼쪽 괄호 ( => 1 push를 해서 1로 넣어줄 것이다
    // 오른쪽 괄호 ) => no가 나오게 만들 것이다 즉 비어있으면 empty 메소드를 써서 비어있으면 no가 출력되게 할 것이다
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 정수 입력
        int n = Integer.parseInt(sc.next());


        for(int i = 0; i<n; i++){
            String input = sc.next();

            String res = "YES";

            Stack st = new Stack<>();
            // 2중 for문을 사용해서 문자열 길이까지


            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) =='('){
                    st.push(1); // 1을 push

                }
                else if(input.charAt(j) == ')') { //문자열을 문자로 바꿔줌

                    if(st.isEmpty()){
                        res = "NO"; // STACK이 비어있으면 NO로 초기화 해준다
                        break;
                    }
                    else {
                        st.pop();
                    }
                }

            }
            if(!st.isEmpty()){ // stack이 비어있지 않다면 
                res="NO";
            }
            System.out.println(res);
        }

    }
}
