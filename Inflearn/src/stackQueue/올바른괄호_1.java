package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호_1 {
/*
1. 올바른 괄호
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.

예시 입력 1 
(()(()))(()
예시 출력 1
NO
 */
	public String solution(String input1) {
		String answer = "YES";
		char[] charArr = input1.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i] == '(') {
				stack.push(charArr[i]);
			}else {
				if(stack.isEmpty()) {
					answer = "NO";
					return answer;
				}else {
					stack.pop();
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		올바른괄호_1 c= new 올바른괄호_1();
		String input1 = in.next();
		System.out.println(c.solution(input1));
	}
}
