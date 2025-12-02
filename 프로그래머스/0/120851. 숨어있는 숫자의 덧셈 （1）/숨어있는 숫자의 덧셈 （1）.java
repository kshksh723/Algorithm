class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] string = my_string.split("");
            System.out.println(" my_string : " +  my_string);
        
        // my_string : 1234
        // my_string : 1234123
        
        for(int i = 0; i < string.length; i++) {
            answer += Integer.parseInt(string[i]);
           
            
            System.out.println("string.length : " + string.length);
            
            
            System.out.println("answer : " + answer);
            
        }
        
        return answer;
    }
}