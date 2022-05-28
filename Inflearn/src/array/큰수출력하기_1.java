package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기_1 {
/*
1. 큰 수 출력하기
설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

예시 입력 1 
6
7 3 9 5 6 12
예시 출력 1
7 9 6 12
 */
	public String solution(int input1, int[] input2) {
		String answer = "";
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(input2[0]);
		for(int i=1; i<input1; i++) {
			if(input2[i] > input2[i-1]) {
				arrList.add(input2[i]);
			}
		}
		for(int x : arrList) {
			answer += x + " ";
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		큰수출력하기_1 c= new 큰수출력하기_1();
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2));
	}
}
