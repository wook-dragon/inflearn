package string;

import java.util.Scanner;

public class ����Ӵܾ�_3 {

	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input = in.nextLine();
	    
	    ����Ӵܾ�_3 c= new ����Ӵܾ�_3();
	    
	    System.out.println(c.solution(input));
	  }
	
	String solution(String input) {
		String answer = "";
		String[] strArray = input.split(" ");
		
		int cnt = 0; //�񱳿�
		for(int i=0; i<strArray.length; i++) {
			if(strArray[i].length() > cnt) {
				cnt = strArray[i].length();
				answer = strArray[i];
			}
		}
		
		return answer;
	}
}
