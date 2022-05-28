package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
/*
4. ��� �Ƴ��׷� ã��
����
S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
�Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.

�Է�
ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�.
S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.

���
S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.

���� �Է� 1 
bacaAacba
abc
���� ��� 1
3
��Ʈ
��¼���: {bac}, {acb}, {cba} 3���� �κй��ڿ��� "abc"���ڿ��� �Ƴ��׷��Դϴ�.
 */
	public int solution(String input1, String input2) {
		int answer = 0;
		Map<Character, Integer> ori_map = new HashMap<Character, Integer>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int len_1 = input1.length();
		int len_2 = input2.length();
		char[] strArr1 = input1.toCharArray();
		char[] strArr2 = input2.toCharArray();
		for(int i=0; i<len_2; i++) {
			ori_map.put(strArr2[i], 1);
		}
		for(int i=0; i<len_1-len_2+1; i++) {
			map.clear();
			for(int j=i; j<len_2+i; j++) {
				map.put(strArr1[i], map.getOrDefault(strArr1, 0)+1);
			}
			if(map.equals(ori_map)) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		String input1 = in.next();
		String input2 = in.next();
		System.out.println(c.solution(input1, input2));
	}
}
