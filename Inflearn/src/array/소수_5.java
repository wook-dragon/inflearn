package array;

import java.util.Scanner;

public class �Ҽ�_5 {
/*
5. �Ҽ�(�����佺�׳׽� ü)
����
�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.

�Է�
ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.

���
ù �ٿ� �Ҽ��� ������ ����մϴ�.

���� �Է� 1 
20
���� ��� 1
8
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
0 0 0 0 0 0 0 0 0 0  0  0  0  0  0  0  0  0  0  0  0
 */
	public int solution(int input) {
		int answer = 0;
		int[] intArr = new int[input+1];
		for(int i=2; i<input+1; i++) {
			if(intArr[i]==0) {
				answer ++;
				for(int j=i; j<input+1; j=j+i) {
					intArr[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�Ҽ�_5 c= new �Ҽ�_5();
		System.out.println(c.solution(in.nextInt()));
	}
}
