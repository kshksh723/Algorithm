import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i=0;i<n;i++){
            Stack<Character> stk = new Stack<>();
            String s=bf.readLine();
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<s.length();j++){
            	if(s.charAt(j) == ' ') {
            		while(!stk.empty()) {
            			sb.append(stk.pop());
            		}
            		sb.append(" ");
            	}else {
                    stk.push(s.charAt(j));
            	}
            }
    		while(!stk.empty()) {
    			sb.append(stk.pop());
    		}
    		System.out.println(sb);
        }
    }
}