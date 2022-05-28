package string;

import java.util.Scanner;

public class ��ȿ���Ӹ����_8 {
/*
����
�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
���ĺ� �̿��� ���ڵ��� �����մϴ�.

�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.

���� �Է� 1 
found7, time: study; Yduts; emit, 7Dnuof
���� ��� 1
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
		��ȿ���Ӹ����_8 c= new ��ȿ���Ӹ����_8();
		System.out.println(c.solution(in.nextLine()));
	}
}
