import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 5개의 숫자를 각각 제곱한 후 더하기
        int sum = 0;
        for(int i= 0; i < 5;  i++){
            int temp = sc.nextInt();
            sum += temp * temp;
        }
        int result = sum % 10;
        System.out.println(result);
    }
}
