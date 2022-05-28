package string;

import java.util.Scanner;

public class 문자열압축_11 {
/*
설명
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
출력
첫 줄에 압축된 문자열을 출력한다.

예시 입력 1 
KKHSSSSSSSE
예시 출력 1
K2HS7E
예시 입력 2 
KSTTTSEEKFKKKDJJGG
예시 출력 2
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
		문자열압축_11 c= new 문자열압축_11();
		System.out.println(c.solution(in.next()));
	}
}
