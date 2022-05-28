package string;

import java.util.Scanner;

public class 문자찾기_1 {

	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    String input2 = in.next();
	    문자찾기_1 answer = new 문자찾기_1();
	    System.out.println(answer.solution(input1, input2));
	  }
	
	int solution(String input1, String input2) {
		int answer = 0;
		input1 = input1.toLowerCase();
		char cInput2 = input2.toLowerCase().charAt(0);
		for(int i=0; i<input1.length(); i++) {
			if(input1.charAt(i)==cInput2) {
				answer++;
			}
		}
		
		return answer;
	}
}
