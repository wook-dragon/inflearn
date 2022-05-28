package string;

import java.util.Scanner;

public class 가장짧은문자거리_10 {
/*
설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.
출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

예시 입력 1 
teachermode e
예시 출력 1
1 0 1 2 1 0 1 2 2 1 0
 */
	public int[] solution(String input, String inputChar) {
		int[] answer = new int[input.length()];
		char input2 = inputChar.charAt(0);
		int point = 1000;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == input2) {
				point = 0;
			}else {
				point++;
			}
			answer[i] = point;
		}
		for(int i=input.length()-1; i>=0; i--) {
			if(input.charAt(i) == input2) {
				point = 0;
			}else {
				point++;
			}
			answer[i] = Math.min(point, answer[i]);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		가장짧은문자거리_10 c= new 가장짧은문자거리_10();
		//System.out.println(c.solution(in.next(),in.next()));
		for(int i : c.solution(in.next(),in.next())) {
			System.out.print(i + " ");
		}
	}
}
