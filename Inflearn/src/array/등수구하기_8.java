package array;

import java.util.Scanner;

public class ������ϱ�_8 {
/*
8. ������ϱ�
����
N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.

�Է�
ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.

���
�Էµ� ������� ����� ����Ѵ�.

���� �Է� 1 
5
87 89 92 100 76
���� ��� 1
4 3 2 1 5
 */
	public String solution(int input1, int[] input2) {
		String answer = "";
		for(int i=0; i<input1; i++) {
			int rank = 1;
			for(int j=0; j<input1; j++) {
				if(input2[j] > input2[i]) {
					rank++;
				}
			}
			answer += rank + " ";
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		������ϱ�_8 c= new ������ϱ�_8();
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2));
	}
}
