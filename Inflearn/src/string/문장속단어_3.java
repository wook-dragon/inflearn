package string;

import java.util.Scanner;

public class 문장속단어_3 {

	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input = in.nextLine();
	    
	    문장속단어_3 c= new 문장속단어_3();
	    
	    System.out.println(c.solution(input));
	  }
	
	String solution(String input) {
		String answer = "";
		String[] strArray = input.split(" ");
		
		int cnt = 0; //비교용
		for(int i=0; i<strArray.length; i++) {
			if(strArray[i].length() > cnt) {
				cnt = strArray[i].length();
				answer = strArray[i];
			}
		}
		
		return answer;
	}
}
