package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ū������ϱ�_1 {
/*
1. ū �� ����ϱ�
����
N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
(ù ��° ���� ������ ����Ѵ�)

�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.

���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.

���� �Է� 1 
6
7 3 9 5 6 12
���� ��� 1
7 9 6 12
 */
	public String solution(int input1, int[] input2) {
		String answer = "";
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(input2[0]);
		for(int i=1; i<input1; i++) {
			if(input2[i] > input2[i-1]) {
				arrList.add(input2[i]);
			}
		}
		for(int x : arrList) {
			answer += x + " ";
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ū������ϱ�_1 c= new ū������ϱ�_1();
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2));
	}
}
