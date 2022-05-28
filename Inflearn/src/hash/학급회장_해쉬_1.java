package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class �б�ȸ��_�ؽ�_1 {
/*
1. �б� ȸ��(�ؽ�)
����
�б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
�������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.

�Է�
ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
�� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.

���
�б� ȸ������ ���õ� ��ȣ�� ����մϴ�.

���� �Է� 1 
15
BACBACCACCBDEDE
���� ��� 1
C
 */
	public char solution(int input1, String input2) {
		char answer = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(char x : input2.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		/*
		char[] charArr = input2.toCharArray();
		Map<Character, Integer> result = new HashMap<Character, Integer>(); 
		for(int i=0; i<charArr.length; i++) {
			if(result.containsKey(charArr[i])) {
				result.put(charArr[i], result.get(charArr[i]) + 1);
			}else {
				result.put(charArr[i], 1);
			}
		}
		for(Map.Entry<Character, Integer> m : result.entrySet()) {
			//System.out.println(m.getKey()+","+m.getValue());
			if(m.getValue() > max) {
				max = m.getValue();
				answer = m.getKey().charValue();
			}
		}
		*/
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�б�ȸ��_�ؽ�_1 c= new �б�ȸ��_�ؽ�_1();
		int input1 = in.nextInt();
		String input2 = in.next();
		System.out.println(c.solution(input1, input2));
	}
}
