/*class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 1인분 => 12000 
        // 음료수 => 2000
        // n인분 음료수 k => 총 얼마 ? 
        // 10분 먹었으면 12000 * 10 = 120000 
        // 여기에 k =>3 개를 먹으면 음료수는 3 * 2000 => 6000원인데  result가 124000원이 나옴 
       int j = n/10;
       
        answer =  (12000 * n) + (2000 * k) + ((k - j) * 2000 );
        return answer;
    }
}
*/
class Solution{
	int solution(int n, int k) {
		int answer = 0;
			answer=(n*12000)+((k-(n/10))*2000);
		return answer;
	}
}