package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class �ι迭��ġ��_1 {
/*
1. �� �迭 ��ġ��
����
������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.
�� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.
�� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.
�� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.

���
������������ ���ĵ� �迭�� ����մϴ�.

���� �Է� 1 
3
1 3 5
5
2 3 6 7 9
���� ��� 1
1 2 3 3 5 6 7 9
 */
	public String solution(int[] input1, int[] input2) {
		String answer = "";
		int p1 = 0;
		int p2 = 0;
		while(p1< input1.length && p2<input2.length) {
			if(input1[p1] < input2[p2]) {
				answer += input1[p1++] + " ";
			}else {
				answer += input2[p2++] + " ";
			}
		}
		if(p1 == input1.length) {
			for(int i=p2; i<input2.length; i++) {
				answer += input2[p2++] + " ";
			}
		}else {
			for(int i=p1; i<input1.length; i++) {
				answer += input1[p1++] + " ";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�ι迭��ġ��_1 c= new �ι迭��ġ��_1();
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
	/*public String solution(ArrayList<Integer> input1, ArrayList<Integer> input2) {
		String answer = "";
		ArrayList<Integer> addArr = new ArrayList<Integer>();
		addArr.addAll(input1);
		addArr.addAll(input2);
		Collections.sort(addArr);
		for(int i=0; i<addArr.size(); i++) {
			answer += addArr.get(i) + " ";
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		int input1 = in.nextInt();
		ArrayList<Integer> intArr1 = new ArrayList<Integer>();
		for(int i=0; i<input1; i++) {
			intArr1.add(in.nextInt());
		}
		int input2 = in.nextInt();
		ArrayList<Integer> intArr2 = new ArrayList<Integer>();
		for(int i=0; i<input2; i++) {
			intArr2.add(in.nextInt());
		}
		System.out.println(c.solution(intArr1, intArr2));
	}*/
}
