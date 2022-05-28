package array;

import java.util.Scanner;

public class �Ǻ���ġ����_4 {
/*
4. �Ǻ���ġ ����
����
1) �Ǻ���Ű ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.

�Է�
ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.
���
ù �ٿ� �Ǻ���ġ ������ ����մϴ�.

���� �Է� 1 
10
���� ��� 1
1 1 2 3 5 8 13 21 34 55
 */
	public String solution(int input) {
		String answer = "";
		int[] fib = new int[input];
		fib[0] = 1;
		fib[1] = 1;
		answer = fib[0] + " " + fib[1] + " "; 
		for(int i=2; i<input; i++) {
			fib[i] += fib[i-2] + fib[i-1];
			answer += fib[i] + " "; 
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�Ǻ���ġ����_4 c= new �Ǻ���ġ����_4();
		System.out.println(c.solution(in.nextInt()));
	}
}
