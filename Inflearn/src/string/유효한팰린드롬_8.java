package string;

import java.util.Scanner;

public class 유효한팰린드롬_8 {
/*
설명
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
알파벳 이외의 문자들의 무시합니다.

입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

예시 입력 1 
found7, time: study; Yduts; emit, 7Dnuof
예시 출력 1
YES
 */
	public String solution(String input) {
		String answer = "YES";
		input = input.toLowerCase();
		char[] strArr = input.toCharArray();
		int lt = 0;
		int rt = input.length()-1;
		for(int i=0; i<input.length()/2; i++) {
			if(Character.isAlphabetic(strArr[lt]) && Character.isAlphabetic(strArr[rt])) {
				if(strArr[lt] == strArr[rt]) {
					lt++;
					rt--;
				}else {
					answer = "NO";
					break;
				}
			}else if(!Character.isAlphabetic(strArr[lt]) && !Character.isAlphabetic(strArr[rt])) {
				lt++;
				rt--;
			}else {
				answer = "NO";
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		유효한팰린드롬_8 c= new 유효한팰린드롬_8();
		System.out.println(c.solution(in.nextLine()));
	}
}
