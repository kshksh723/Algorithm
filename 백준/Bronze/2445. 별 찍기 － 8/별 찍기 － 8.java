import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 별찍기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 패턴의 위쪽 부분
        for (int i = 1; i <= N; i++) {
            // 왼쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 중간 공백 출력
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }
            // 오른쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        // 패턴의 아래쪽 부분
        for (int i = N - 1; i >= 1; i--) {
            // 왼쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 중간 공백 출력
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }
            // 오른쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        sc.close();
    }
}
