package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class �Ƴ��׷�_�ؽ�_2 {
/*
2. �Ƴ��׷�(�ؽ�)
����
Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �մϴ�.
���� ��� AbaAeCe �� baeeACA �� ���ĺ��� ���� ������ �ٸ����� �� ������ ���캸�� A(2), a(1), b(1), C(1), e(2)��
���ĺ��� �� ������ ��� ��ġ�մϴ�. �� ��� �� �ܾ �� �迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.
���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.

�Է�
ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�.
�ܾ��� ���̴� 100�� ���� �ʽ��ϴ�.

���
�� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.

���� �Է� 1 
AbaAeCe
baeeACA
���� ��� 1
YES
���� �Է� 2 
abaCC
Caaab
���� ��� 2
NO
 */
	public String solution(String input1, String input2) {
		String answer = "YES";
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		map1 = this.getCount(input1);
		map2 = this.getCount(input2);
		if(!map1.equals(map2)) answer = "NO";
		/*
		for(char key : map1.keySet()) {
			if(map2.containsKey(key)) {
				if(map1.get(key) != map2.get(key)) {
					answer = "NO";
					return answer;
				}
			}else {
				answer = "NO";
				return answer;
			}
		}
		*/
		return answer;
	}
	
	public Map<Character, Integer> getCount(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		return map;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�Ƴ��׷�_�ؽ�_2 c= new �Ƴ��׷�_�ؽ�_2();
		String input1 = in.next();
		String input2 = in.next();
		System.out.println(c.solution(input1, input2));
	}
}
