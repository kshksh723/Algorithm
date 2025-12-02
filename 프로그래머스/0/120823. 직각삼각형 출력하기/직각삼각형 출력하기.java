import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 외부 루프: 줄(행)의 개수를 결정합니다.
        for(int i = 0; i < n; i++){
            // 내부 루프: i번째 줄에 출력할 별의 개수를 결정합니다.
            // i가 0일 때 1개, i가 1일 때 2개, ...
            for(int j = 0; j <= i; j++){ 
                System.out.print("*"); // 줄바꿈 없이 별 하나 출력
            }
            System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈
        }
    }
}