import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 입력: 컵의 위치를 바꾼 횟수 M
        int M = scanner.nextInt();
        
        // 초기 공의 위치는 1번 컵에 있다고 가정
        int ballPosition = 1;
        
        // M번 동안 컵의 위치를 바꾸는 작업을 수행
        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // 공의 위치가 X번 컵에 있으면 Y번 컵으로, Y번 컵에 있으면 X번 컵으로 변경
            if (ballPosition == X) {
                ballPosition = Y;
            } else if (ballPosition == Y) {
                ballPosition = X;
            }
        }
        
        // 공이 들어 있는 컵의 번호 출력
        System.out.println(ballPosition);
        
        scanner.close();
    }
}
