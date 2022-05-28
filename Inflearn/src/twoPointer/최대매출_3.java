package twoPointer;

import java.util.Scanner;

public class �ִ����_3 {
/*
3. �ִ� ����
����
������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.
���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�
12 1511 20 2510 20 19 13 15
���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
�������� ������ �����ּ���.

�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.

���
ù �ٿ� �ִ� ������� ����մϴ�.

���� �Է� 1 
10 3
12 15 11 20 25 10 20 19 13 15
���� ��� 1
56
 */
	public int solution(int input1, int input2, int[] intArr) {
		int answer = 0;
		int sum = 0;
		for(int i=0; i<input2; i++) sum+=intArr[i];
		answer = sum;
		for(int i=input2; i<input1; i++) {
			sum+= (intArr[i]-intArr[i-input2]);
			answer = Math.max(sum, answer);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�ִ����_3 c= new �ִ����_3();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
	/*
	public int solution(int input1, int input2, int[] intArr) {
		int answer = 0;
		int tmp = 0;
		for(int i=0; i<input1-input2+1; i++) {
			tmp = 0;
			for(int j=i; j<i+input2; j++) {
				tmp += intArr[j];
			}
			if(tmp > answer) answer = tmp; 
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
	*/
}
