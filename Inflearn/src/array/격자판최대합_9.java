package array;

import java.util.Scanner;

public class �������ִ���_9 {
/*
9. ������ �ִ���
����
5*5 �����ǿ� �Ʒ��� ���� ���ڰ� �����ֽ��ϴ�.
Image1.jpg
N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.

�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.

���
�ִ����� ����մϴ�.

���� �Է� 1 
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
���� ��� 1
155
 */
	public int solution(int input1, int[][] input2) {
		int answer = 0;
		for(int i=0; i<input1; i++) {
			int tmp = 0;
			for(int j=0; j<input1; j++) {
				tmp += input2[i][j];
			}
			if(tmp > answer) answer = tmp;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�������ִ���_9 c= new �������ִ���_9();
		int input1 = in.nextInt();
		int[][] input2 = new int[input1][input1];
		for(int i=0; i<input1; i++) {
			for(int j=0; j<input1; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		System.out.println(c.solution(input1, input2));
	}
}
