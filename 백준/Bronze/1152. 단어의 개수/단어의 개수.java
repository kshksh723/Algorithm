import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        sc.close();

        if(a.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = a.trim().split("\\s+");
            System.out.println(words.length);
        }



    }
}
