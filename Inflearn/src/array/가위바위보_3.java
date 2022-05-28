package array;

import java.util.Scanner;

public class ����������_3 {
/*
3. ���� ���� ��
����
A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.
����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
���� ��� N=5�̸�
Image1.jpg
�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.
�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.

���
�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.

���� �Է� 1 
5
2 3 3 1 3
1 1 2 2 3
���� ��� 1
A
B
A
B
D
 */
	public String solution(int input1, int[] input2, int[] input3) {
		String answer = "";
		for(int i=0; i<input1; i++) {
			if(input2[i] - input3[i] == 1 || input2[i] - input3[i] == -2) {
				answer += "A\n";
			}else if(input2[i] - input3[i] == -1 || input2[i] - input3[i] == 2) {
				answer += "B\n";
			}else {
				answer += "D\n";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		����������_3 c= new ����������_3();
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		int[] input3 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		for(int i=0; i<input1; i++) {
			input3[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, input3));
	}
}
