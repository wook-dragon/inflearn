package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main {
/*
4. ������ ����(postfix)
����
����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.

�Է�
ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.
���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.

���
������ ����� ����մϴ�.

���� �Է� 1 
352+*9-
���� ��� 1
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
