package string;

import java.util.Scanner;

public class �ߺ���������_6 {
/*
����
�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.

�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.

���� �Է� 1 
ksekkset
���� ��� 1
kset
 */
	public String solution(String input) {
		String answer = "";
		char[] strArr = input.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			if(input.indexOf(strArr[i])==i) { //indexOf �� ���ڿ��� ���� ù��° index�� ��ȯ
				answer += strArr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		�ߺ���������_6 c= new �ߺ���������_6();
		System.out.println(c.solution(in.next()));
	}
	/*
	public String solution(String input) {
		String answer = "";
		char[] strArr = input.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			int cnt = 0;
			for(int j=0; j<answer.length(); j++) {
				char[] strArr2 = answer.toCharArray();
				if(strArr[i] == strArr2[j]) {
					cnt++;
				}
			}
			if(cnt == 0) {
				answer += strArr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    Main c= new Main();
    	System.out.println(c.solution(in.next()));
	}
	*/
}
