class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int firstIndex = box[0]/n; 
        int secondIndex = box[1]/n;
        int threeIndex = box[2]/n;
        
     answer = firstIndex * secondIndex * threeIndex;
        
        return answer;
    }
}