package string;

import java.util.Scanner;

public class 중복문자제거_6 {
/*
설명
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

예시 입력 1 
ksekkset
예시 출력 1
kset
 */
	public String solution(String input) {
		String answer = "";
		char[] strArr = input.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			if(input.indexOf(strArr[i])==i) { //indexOf 이 문자열이 나온 첫번째 index값 반환
				answer += strArr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		중복문자제거_6 c= new 중복문자제거_6();
		System.out.println(c.solution(in.next()));
	}
	/*
	public String solution(String input) {
		String answer = "";
		char[] strArr = input.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			int cnt = 0;
			for(int j=0; j<answer.length(); j++) {
				char[] strArr2 = answer.toCharArray();
				if(strArr[i] == strArr2[j]) {
					cnt++;
				}
			}
			if(cnt == 0) {
				answer += strArr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    Main c= new Main();
    	System.out.println(c.solution(in.next()));
	}
	*/
}
