class Solution {
    // 아이스 아메리카노는 한잔에 5,500원입니다.
    private static final int PRICE_AMERICANO = 5_500;

    // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    public int[] solution(int money) {
        // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
        int cups = money / PRICE_AMERICANO; // 15_000 / 5_500 = 2
        // 남는 돈을
        int remains = money % PRICE_AMERICANO; // 15_000 % 5_500 = 4_000

        int[] answer = {cups, remains};
        // 순서대로 담은 배열을 return 하도록
        return answer;
    }
}