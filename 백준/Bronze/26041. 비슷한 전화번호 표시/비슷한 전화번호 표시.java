import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // 공백으로 구분된 전화번호 목록 a와 하나의 전화번호 b가 주어짐

        // b는 접두사로 가지면서 b와 다른 전화번호 개수를 찾아야 한다

    // 입력 받기
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

    // a에서 전화번호들을 분리 --> "n개의 전화번호가 공백으로 구분된 문자열 A가 주어진다" ==> 입력값 12 121 123 1234 134 135 21 2134
        String[] phoneNumber = a.split(" ");

        int count = 0; // 조건을 만족하는 전화번호 개수를 세기 위한 변수를 초기화 한다
        for (String number : phoneNumber) { // 분리된 전화번호에 대하여 반복문
            if (!number.equals(b) && number.startsWith(b)) { // 전화번호가 다른지 현재 전화번호가 B로 시작하는지 (B를 접두사로 가지는지) 
                count++;
            }
        }
        
        sc.close();

        System.out.println(count);

    }


}