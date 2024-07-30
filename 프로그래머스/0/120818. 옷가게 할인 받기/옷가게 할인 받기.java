class Solution {
    public static int solution(int price) {
        int answer = 0;
       if(price >=500000){
           answer = 20;
       }
       else if(price >= 300000){
           answer = 10;
       }
       else if(price >= 100000){
           answer = 5;
       }
        // System.out.println((double)(price *answer)/100);
       answer = (int)(price - ((double)(price *answer)/100));

        return answer;
    }
}