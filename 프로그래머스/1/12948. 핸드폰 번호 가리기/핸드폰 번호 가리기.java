class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        String[] number = phone_number.split("");
        
        int len = number.length;
        
        for(int i = 0; i < len; i++) {
            if(i< len - 4)
                answer += "*";
            else 
                answer += number[i];
        } 
        return answer;
        
        
    }
}