package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ��ȣ��������_2 {
/*
2. ��ȣ��������
����
�Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.

���
���� ���ڸ� ����Ѵ�.

���� �Է� 1 
(A(BC)D)EF(G(H)(IJ)K)LM(N)
���� ��� 1

EFLM
 */
	public String solution(String input1) {
		String answer = "";
		char[] charArr = input1.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i] == ')') {
				while(stack.pop() != '(');
			}else {
				stack.push(charArr[i]);
			}
		}
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		��ȣ��������_2 c= new ��ȣ��������_2();
		String input1 = in.next();
		System.out.println(c.solution(input1));
	}
}
