package twoPointer;

import java.util.Scanner;

public class ���Ӻκм���_4 {
/*
4. ���� �κм���
����
N���� ���� �̷���� ������ �־����ϴ�.
�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
���� N=8, M=6�̰� ������ ������ ���ٸ�
1 2 1 3 1 1 1 2
���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.

�Է�
ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.
������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.

���
ù° �ٿ� ����� ���� ����Ѵ�.

���� �Է� 1 
8 6
1 2 1 3 1 1 1 2
���� ��� 1
3
 */
	public int solution(int input1, int input2, int[] intArr) {
		int answer = 0;
		int tmp = 0; 
		for(int i=0; i<input1; i++) {
			tmp = 0;
			for(int j=i; j<input1; j++) {
				tmp += intArr[j];
				if(tmp==input2) {
					answer++;
					break;
				}else if(tmp>input2) {
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		���Ӻκм���_4 c= new ���Ӻκм���_4();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
}
