package array;

import java.util.Scanner;

public class ���츮_10 {
/*
10. ���츮
����
���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.
Image1.jpg

�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.

���
���츮�� ������ ����ϼ���.

���� �Է� 1 
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
���� ��� 1
10
 */
	//    22   12  23  32  21
	public int solution(int input1, int[][] input2) {
		int answer = 0;
		for(int i=1; i<input1-1; i++) {
			for(int j=1; j<input1-1; j++) {
				if(input2[i-1][j] > input2[i][j]) break;
				if(input2[i][j+1] > input2[i][j]) break;
				if(input2[i+1][j] > input2[i][j]) break;
				if(input2[i][j-1] > input2[i][j]) break;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		���츮_10 c= new ���츮_10();
		int input1 = in.nextInt();
		input1 = input1+2;
		int[][] input2 = new int[input1][input1];
		for(int i=0; i<input1; i++) {
			for(int j=0; j<input1; j++) {
				if(i==0 || j ==0 || i==input1-1 || j==input1-1) {
					input2[i][j] = 0;
				}else {
					input2[i][j] = in.nextInt();
				}
			}
		}
		System.out.println(c.solution(input1, input2));
	}
}
