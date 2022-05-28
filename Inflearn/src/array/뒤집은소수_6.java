package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class �������Ҽ�_6 {
/*
6. ������ �Ҽ�
����
N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�.
ù �ڸ������� ���ӵ� 0�� �����Ѵ�.

�Է�
ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.
�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.

���
ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.
���� �Է� 1 
9
32 55 62 20 250 370 200 30 100
���� ��� 1
23 2 73 2 3
 */
	public String solution(String[] input, int max) {
		String answer = "";
		int[] chk = new int[max+1];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=2; i<max+1; i++) {
			if(chk[i]==0) {
				map.put(i, 1);
				for(int j=i; j<max+1; j=j+i) {
					chk[j] = 1;
				}
			}
		}
		for(int i=0; i<input.length; i++) {
			String reStr = new StringBuilder(input[i]).reverse().toString();
			int sosu = Integer.parseInt(reStr);
			if(map.containsKey(sosu)) {
				answer += sosu + " ";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�������Ҽ�_6 c= new �������Ҽ�_6();
		int input1 = in.nextInt();
		String[] input2 = new String[input1];
		int max = 0;
		for(int i=0; i<input1; i++) {
			input2[i] = in.next();
			int tmp = Integer.parseInt(input2[i]);
			if(tmp > max) {
				max = tmp;
			}
		}
		System.out.println(c.solution(input2, max));
	}
}
