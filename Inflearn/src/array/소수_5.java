package array;

import java.util.Scanner;

public class 소수_5 {
/*
5. 소수(에라토스테네스 체)
설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.

예시 입력 1 
20
예시 출력 1
8
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
0 0 0 0 0 0 0 0 0 0  0  0  0  0  0  0  0  0  0  0  0
 */
	public int solution(int input) {
		int answer = 0;
		int[] intArr = new int[input+1];
		for(int i=2; i<input+1; i++) {
			if(intArr[i]==0) {
				answer ++;
				for(int j=i; j<input+1; j=j+i) {
					intArr[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		소수_5 c= new 소수_5();
		System.out.println(c.solution(in.nextInt()));
	}
}
