package array;

import java.util.Scanner;

public class ���̴��л�_2 {
/*
2. ���̴� �л�
����
�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)

�Է�
ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
���
�������� �� �� �ִ� �ִ��л����� ����Ѵ�.

���� �Է� 1 
8
130 135 148 140 145 150 150 153
���� ��� 1
5
 */
	public int solution(int input, int[] input2) {
		int answer = 0;
		int max = 0;
		for(int x : input2) {
			if(x > max) {
				max = x;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		���̴��л�_2 c= new ���̴��л�_2();
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2));
	}
}
