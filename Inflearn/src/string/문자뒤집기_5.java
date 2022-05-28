package string;

import java.util.Scanner;
/*
설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

예시 입력 1 
a#b!GE*T@S
예시 출력 1
S#T!EG*b@a
 */
public class 문자뒤집기_5 {
	public String solution(String input) {
		String answer = "";
		char[] strArr = input.toCharArray();
		int lt = 0;
		int rt = input.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(strArr[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(strArr[rt])) {
				rt--;
			}else {
				char tmp = strArr[lt];
				strArr[lt] = strArr[rt];
				strArr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = new String(strArr);
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    문자뒤집기_5 main = new 문자뒤집기_5();
	    System.out.println(main.solution(in.next()));
	}

/*
	public String solution(String input) {
		String answer = "";
		char[] strArr = new char[input.length()];
		for(int i =0; i<input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				strArr[i] = input.charAt(input.length()-1-i);
			}else {
				strArr[i] = input.charAt(i);
			}
		}
		answer = new String(strArr);
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    Main main = new Main();
	    System.out.println(main.solution(in.next()));
	}
*/
}
