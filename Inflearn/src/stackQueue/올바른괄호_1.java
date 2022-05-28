package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class �ùٸ���ȣ_1 {
/*
1. �ùٸ� ��ȣ
����
��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
(())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.

�Է�
ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.

���
ù ��° �ٿ� YES, NO�� ����Ѵ�.

���� �Է� 1 
(()(()))(()
���� ��� 1
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
		�ùٸ���ȣ_1 c= new �ùٸ���ȣ_1();
		String input1 = in.next();
		System.out.println(c.solution(input1));
	}
}
