import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 보통 문자열을 반복해서 쓸 땐 for문을 사용해서 반복했지만 repeat를 사용하여 편하게 문자열을 반복 나열 할 수 있다
        // repeat() : String의 메서드, String 문자열을 파라미터의 주어진 횟수만큼 반복
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {

            int R = sc.nextInt();

            String S = sc.next(); // nextLine()이라고 쓰면 x

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) { // R 만큼 반복 출력
                    System.out.print(S.charAt(j));

                }

            }
            System.out.println();
        }

        }

}
