import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt(); // 아이템의 개수
        int K = scanner.nextInt(); // 배낭의 최대 무게

        int[] weights = new int[N]; // 각 아이템의 무게
        int[] values = new int[N];  // 각 아이템의 가치

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        // 동적 프로그래밍을 위한 2차원 배열 초기화
        int[][] dp = new int[N + 1][K + 1];

        // DP 테이블 채우기
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= K; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // 결과 출력
        System.out.println(dp[N][K]);

        scanner.close();
    }
}
