package string;

import java.util.Scanner;

public class ���ڿ�����_11 {
/*
����
���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.

�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.

���� �Է� 1 
KKHSSSSSSSE
���� ��� 1
K2HS7E
���� �Է� 2 
KSTTTSEEKFKKKDJJGG
���� ��� 2
KST3SE2KFK3DJ2G2
 */
	public String solution(String input) {
		String answer = "";
		int cnt = 1;
		char[] strArr = input.toCharArray();
		answer += strArr[0];
		for(int i=1; i<strArr.length; i++) {
			if(strArr[i-1] == strArr[i]) {
				cnt++;
			}else {
				answer = answer + String.valueOf(cnt) + strArr[i];
				cnt = 1;
			}
			if(i == strArr.length-1 && cnt != 1) {
				answer = answer + String.valueOf(cnt);
			}
		}
		answer = answer.replaceAll("1", "");
		
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		���ڿ�����_11 c= new ���ڿ�����_11();
		System.out.println(c.solution(in.next()));
	}
}
