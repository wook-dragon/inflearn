package string;

import java.util.Scanner;

public class ���ڸ�����_9 {
/*
����
���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.

�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
���
ù �ٿ� �ڿ����� ����մϴ�.

���� �Է� 1 
g0en2T0s8eSoft
���� ��� 1
208
 */
	public int solution(String input) {
		int answer = Integer.MIN_VALUE;
		char[] strArr = input.toCharArray();
		String tmp = "";
		for(char x : strArr) {
			if(Character.isDigit(x)) {
				tmp += x;
			}
		}
		answer = Integer.parseInt(tmp);
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		���ڸ�����_9 c= new ���ڸ�����_9();
		System.out.println(c.solution(in.nextLine()));
	}
}
