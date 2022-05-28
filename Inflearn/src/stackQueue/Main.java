package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main {
/*
4. 후위식 연산(postfix)
설명
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

출력
연산한 결과를 출력합니다.

예시 입력 1 
352+*9-
예시 출력 1
12
 */
	public int solution(String input) {
		int answer = 0;
		char[] cArr = input.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int lt = 0;
		int rt = 0;
		for(int i=0; i<cArr.length; i++) {
			if(Character.isDigit(cArr[i])) {
				stack.push(Character.getNumericValue(cArr[i]));
			}else {
				rt = stack.pop();
				lt = stack.pop();
				if(cArr[i] == '+') {
					stack.push(lt+rt);
				}else if(cArr[i] == '-') {
					stack.push(lt-rt);
				}else if(cArr[i] == '*') {
					stack.push(lt*rt);
				}else if(cArr[i] == '/') {
					stack.push(lt/rt);
				}
			}
		}
		answer = stack.pop();
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		String input = in.next();
		System.out.println(c.solution(input));
	}
}
