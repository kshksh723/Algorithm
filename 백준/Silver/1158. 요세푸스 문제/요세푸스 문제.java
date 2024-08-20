import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 K를 입력받습니다.
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // 1부터 N까지의 숫자를 담을 큐를 생성합니다.
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 1부터 N까지의 숫자를 추가합니다.
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 결과를 저장할 문자열을 생성합니다.
        StringBuilder result = new StringBuilder();
        result.append("<");

        // 큐에서 모든 사람을 제거할 때까지 반복합니다.
        while (!queue.isEmpty()) {
            // K-1번 앞의 사람들을 뒤로 보냅니다.
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll()); // 큐의 맨 앞의 요소를 꺼내서 다시 큐의 뒤로 넣습니다.
            }
            // K번째 사람을 큐에서 제거하고 결과에 추가합니다.
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", "); // 남은 사람이 있다면 쉼표를 추가합니다.
            }
        }

        result.append(">");

        // 최종 결과를 출력합니다.
        System.out.println(result.toString());
    }
}