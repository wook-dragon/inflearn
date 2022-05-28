package hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class �����������_3 {
/*
3. ������� ����
����
������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ ������� ������
�� �������� ���϶�� �߽��ϴ�.
���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
20 12 20 10 23 17 10
�� ���� 4�ϰ��� ������ ����������
ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
�� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
�� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
�� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������
������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.

���
ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.

���� �Է� 1 
7 4
20 12 20 10 23 17 10
���� ��� 1
3 4 4 3
 */
	public String solution(int input1, int input2, int[] intArr) {
		String answer = "";
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<input1-input2+1; i++) {
			set.clear();
			for(int j=i; j<i+input2; j++) {
				set.add(intArr[j]);
			}
			answer += set.size() + " ";
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�����������_3 c= new �����������_3();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
}
