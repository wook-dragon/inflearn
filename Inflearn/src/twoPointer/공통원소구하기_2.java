package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ������ұ��ϱ�_2 {
/*
2. ������� ���ϱ�
����
A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.

���
�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.

���� �Է� 1 
5
1 3 9 5 2
5
3 2 5 7 8
���� ��� 1
2 3 5
 */
	public String solution(int[] input1, int[] input2) {
		String answer = "";
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		for(int i=0; i<input1.length; i++) {
			for(int j=0; j<input2.length; j++) {
				if(input1[i]==input2[j]) {
					intArr.add(input2[j]);
				}
			}
		}
		Collections.sort(intArr);
		for(int i=0; i<intArr.size(); i++) {
			answer += intArr.get(i) + " ";
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		������ұ��ϱ�_2 c= new ������ұ��ϱ�_2();
		int input1 = in.nextInt();
		int[] intArr1 = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr1[i] = in.nextInt();
		}
		int input2 = in.nextInt();
		int[] intArr2 = new int[input2];
		for(int i=0; i<input2; i++) {
			intArr2[i] = in.nextInt();
		}
		System.out.println(c.solution(intArr1, intArr2));
	}
}
