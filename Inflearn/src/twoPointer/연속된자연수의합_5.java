package twoPointer;

import java.util.Scanner;

public class ���ӵ��ڿ�������_5 {
/*
5. ���ӵ� �ڿ����� ��
����
N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� N=15�̸�
7+8=15
4+5+6=15
1+2+3+4+5=15
�� ���� �� 3������ ��찡 �����Ѵ�.

�Է�
ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.

���
ù �ٿ� �� ������ ����մϴ�.

���� �Է� 1 
15
���� ��� 1
3
 */
	public int solution(int input) {
		int answer = 0;
		int sum = 0;
		for(int i=1; i<input; i++) {
			sum = 0;
			for(int j=i; j<input; j++) {
				sum += j;
				if(sum == input) {
					answer++;
					break;
				}else if(sum > input) {
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		���ӵ��ڿ�������_5 c= new ���ӵ��ڿ�������_5();
		int input = in.nextInt();
		System.out.println(c.solution(input));
	}
}
