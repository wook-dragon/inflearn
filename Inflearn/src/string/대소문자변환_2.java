package string;

import java.util.Scanner;

public class 대소문자변환_2 {

	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input = in.next();
	    
	    대소문자변환_2 c= new 대소문자변환_2();
	    
	    System.out.println(c.solution(input));
	  }
	
	String solution(String input) {
		String answer = "";
		for(char x : input.toCharArray()) {
			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);
		}
		return answer;
	}
	/*
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String input = in.next();
		
		change_string_2 c= new change_string_2();
		
		System.out.println(c.solution(input));
	}
	
	String solution(String input) {
		
		char[] c_array = new char[input.length()];
		
		for(int i=0; i<input.length(); i++) {
			char tmp = input.charAt(i);
			if(Character.isUpperCase(tmp)) {
				tmp = Character.toLowerCase(tmp);
			}else {
				tmp = Character.toUpperCase(tmp);
			}
			c_array[i] = tmp;
		}
		String answer = new String(c_array);
		return answer;
	}
	*/
}
