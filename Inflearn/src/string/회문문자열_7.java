package string;

import java.util.Scanner;

public class ȸ�����ڿ�_7 {
/*
����
�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.

�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.

���� �Է� 1 
gooG
���� ��� 1
YES
 */
	public String solution(String input) {
		String answer = "NO";
		input = input.toLowerCase();
		String reInput = new StringBuilder(input).reverse().toString();
		if(input.equals(reInput)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ȸ�����ڿ�_7 c= new ȸ�����ڿ�_7();
		System.out.println(c.solution(in.next()));
	}
	/*
	public String solution(String input) {
		String answer = "NO";
		input = input.toLowerCase();
		char[] strArr = input.toCharArray();
		int lt = 0;
		int rt = strArr.length-1;
		boolean chk = true;
		while(lt<rt) {
			if(strArr[lt] == strArr[rt]) {
				lt++;
				rt--;
			}else {
				chk = false;
				break;
			}
		}
		if(chk) {
			answer = "YES";
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
