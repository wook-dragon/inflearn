package string;

import java.util.Scanner;

public class ���ڵ�����_4 {

	public String solution(String input) {
		String answer = "";
		for(int i=input.length()-1; i>=0; i--) {
			answer += input.charAt(i);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int cnt = Integer.parseInt(in.nextLine());
	    ���ڵ�����_4 c= new ���ڵ�����_4();
	    String[] str_cnt = new String [cnt];
	    for(int i=0; i<cnt; i++) {
	    	str_cnt[i] = c.solution(in.nextLine());
	    }
	    for(int i=0; i<cnt; i++) {
	    	System.out.println(str_cnt[i]);
	    }
	}
}
