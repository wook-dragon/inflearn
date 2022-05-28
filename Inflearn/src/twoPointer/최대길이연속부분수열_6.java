package twoPointer;

import java.util.Scanner;

public class �ִ���̿��Ӻκм���_6 {
/*
6. �ִ� ���� ���Ӻκм���
����
0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �������� �� �������� �ִ� k���� 0�� 1�� ������ �� �ֽ��ϴ�. �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������ ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���
1 1 0 0 1 1 0 1 1 0 1 1 0 1
�������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм�����
Image1.jpg
�̸� �� ���̴� 8�Դϴ�.

�Է�
ù ��° �ٿ� ������ ������ �ڿ��� N(5<=N<100,000)�� �־����ϴ�.
�� ��° �ٿ� N������ 0�� 1�� ������ ������ �־����ϴ�.

���
ù �ٿ� �ִ� ���̸� ����ϼ���.

���� �Է� 1 
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1
���� ��� 1
8
 */
	public int solution(int input1, int input2, int[] intArr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		for(int rt=0; rt<input1; rt++) {
			if(intArr[rt]==0) cnt++;
			while(cnt>input2) {
				if(intArr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�ִ���̿��Ӻκм���_6 c= new �ִ���̿��Ӻκм���_6();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
}
