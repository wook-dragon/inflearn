package string;

import java.util.Scanner;

public class ����ª�����ڰŸ�_10 {
/*
����
�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
���ڿ��� ���̴� 100�� ���� �ʴ´�.
���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.

���� �Է� 1 
teachermode e
���� ��� 1
1 0 1 2 1 0 1 2 2 1 0
 */
	public int[] solution(String input, String inputChar) {
		int[] answer = new int[input.length()];
		char input2 = inputChar.charAt(0);
		int point = 1000;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == input2) {
				point = 0;
			}else {
				point++;
			}
			answer[i] = point;
		}
		for(int i=input.length()-1; i>=0; i--) {
			if(input.charAt(i) == input2) {
				point = 0;
			}else {
				point++;
			}
			answer[i] = Math.min(point, answer[i]);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		����ª�����ڰŸ�_10 c= new ����ª�����ڰŸ�_10();
		//System.out.println(c.solution(in.next(),in.next()));
		for(int i : c.solution(in.next(),in.next())) {
			System.out.print(i + " ");
		}
	}
}
