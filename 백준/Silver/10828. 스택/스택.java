

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static class Stack<T> { // 스택 클래스를 제네릭으로 정의하여 다양한 타입의 데이터를 저장할 수 있도록 합니다.
        private final LinkedList<T> list = new LinkedList<>(); // 내부 데이터 저장을 위한 LinkedList 사용.

        public boolean isEmpty(){
            return list.isEmpty(); // 스택이 비어 있는지 확인하는 메서드입니다.
        }

        // 스택에 데이터를 추가하는 메서드입니다.
        public void push(T item) {
            list.addLast(item); // 데이터를 리스트의 끝에 추가합니다. 이 아이템은 스택의 가장 위에 쌓이게 됩니다.
        }

        // 스택에서 데이터를 제거하고 반환하는 메서드입니다.
        public T pop() {
            if (isEmpty()) { // 스택이 비어 있으면 -1을 반환합니다.
                return null; // 예외를 발생시키는 대신 null을 반환하여 비어있는 상태를 처리합니다.
            }
            return list.removeLast(); // 스택의 가장 마지막 데이터를 제거하고 반환합니다.
        }

        // 스택의 가장 위에 있는 데이터를 확인하는 메서드입니다. (제거하지 않음)
        public T peek() {
            if (isEmpty()) { // 스택이 비어 있으면 -1을 반환합니다.
                return null; // 예외를 발생시키는 대신 null을 반환하여 비어있는 상태를 처리합니다.
            }
            return list.getLast(); // 스택의 마지막 데이터를 반환하지만, 제거하지는 않습니다.
        }

        // 스택에 있는 데이터의 개수를 반환하는 메서드입니다.
        public int size() {
            return list.size(); // 리스트에 저장된 데이터의 개수를 반환합니다.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위해 Scanner를 사용합니다.
        Stack<Integer> stack = new Stack<>(); // Integer 타입의 데이터를 저장할 Stack 객체를 생성합니다.

        int N = sc.nextInt(); // 명령어의 수를 입력받습니다.
        sc.nextLine(); // 숫자 입력 후 다음 줄로 이동합니다.

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine(); // 각 명령어를 입력받습니다.
            if (command.startsWith("push")) { // 명령어가 "push"로 시작하면
                int value = Integer.parseInt(command.split(" ")[1]); // 공백으로 나눠서 두 번째 부분인 숫자를 추출합니다.
                stack.push(value); // 추출한 숫자를 스택에 추가합니다.
            } else if (command.equals("pop")) { // 명령어가 "pop"인 경우
                Integer result = stack.pop();
                if (result == null) {
                    System.out.println(-1); // 스택이 비어 있을 경우 -1을 출력합니다.
                } else {
                    System.out.println(result); // 스택에서 제거된 값을 출력합니다.
                }
            } else if (command.equals("size")) { // 명령어가 "size"인 경우
                System.out.println(stack.size()); // 스택의 크기를 출력합니다.
            } else if (command.equals("empty")) { // 명령어가 "empty"인 경우
                System.out.println(stack.isEmpty() ? 1 : 0); // 스택이 비어 있으면 1, 아니면 0을 출력합니다.
            } else if (command.equals("top")) { // 명령어가 "top"인 경우
                Integer result = stack.peek();
                if (result == null) {
                    System.out.println(-1); // 스택이 비어 있을 경우 -1을 출력합니다.
                } else {
                    System.out.println(result); // 스택의 가장 위에 있는 값을 출력합니다.
                }
            }
        }

        sc.close(); // 입력을 마친 후 Scanner를 닫습니다.
    }
}

