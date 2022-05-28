package string;

import java.util.Scanner;
/*
����
���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
���
ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.

���� �Է� 1 
a#b!GE*T@S
���� ��� 1
S#T!EG*b@a
 */
public class ���ڵ�����_5 {
	public String solution(String input) {
		String answer = "";
		char[] strArr = input.toCharArray();
		int lt = 0;
		int rt = input.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(strArr[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(strArr[rt])) {
				rt--;
			}else {
				char tmp = strArr[lt];
				strArr[lt] = strArr[rt];
				strArr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = new String(strArr);
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    ���ڵ�����_5 main = new ���ڵ�����_5();
	    System.out.println(main.solution(in.next()));
	}

/*
	public String solution(String input) {
		String answer = "";
		char[] strArr = new char[input.length()];
		for(int i =0; i<input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				strArr[i] = input.charAt(input.length()-1-i);
			}else {
				strArr[i] = input.charAt(i);
			}
		}
		answer = new String(strArr);
		return answer;
	}
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    Main main = new Main();
	    System.out.println(main.solution(in.next()));
	}
*/
}
