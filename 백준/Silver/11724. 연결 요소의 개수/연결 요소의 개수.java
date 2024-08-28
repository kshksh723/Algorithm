import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N, M;
    static ArrayList<Integer> list[]; //인접리스트 방식
    static boolean visited[];

    void DFS(int s) {
        visited[s] = true;
        for (int e : list[s]) {
            if (visited[e]) continue;
            DFS(e);
        }
    }

    void BFS(int s) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        visited[s] = true;

        while (!Q.isEmpty()) {
            int now = Q.poll();
            for (int next : list[now]) {
                if (visited[next]) continue;
                Q.offer(next);
                visited[next] = true;
            }
        }
    }

	void Solve() {
        int count = 0;
        visited = new boolean[N+1];
        // 한번 순회가 되는 서클이 연결요소이다.
        // DFS/BFS 탐색이 종료되었다는 것은 더이상 연결된 정점이 없다는 뜻이다.
        // 즉, 그래프 탐색 횟수 == 연결요소 개수 이다
        for (int i=1; i<=N; i++) {
            if (visited[i]) continue;
            //DFS(i);
            BFS(i);
            count++;
        }
        System.out.println(count);
	}

    void inputData() throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        for (int i=1; i<=N; i++) {//노드번호가 1부터라서 1부터 할당함
            list[i] = new ArrayList<Integer>();
        }
        
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.inputData(); // 입력 받는 부분
        m.Solve();// 여기서부터 작성
    }
}