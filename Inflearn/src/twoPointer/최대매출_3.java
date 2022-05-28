package twoPointer;

import java.util.Scanner;

public class 최대매출_3 {
/*
3. 최대 매출
설명
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 1511 20 2510 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.

입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

출력
첫 줄에 최대 매출액을 출력합니다.

예시 입력 1 
10 3
12 15 11 20 25 10 20 19 13 15
예시 출력 1
56
 */
	public int solution(int input1, int input2, int[] intArr) {
		int answer = 0;
		int sum = 0;
		for(int i=0; i<input2; i++) sum+=intArr[i];
		answer = sum;
		for(int i=input2; i<input1; i++) {
			sum+= (intArr[i]-intArr[i-input2]);
			answer = Math.max(sum, answer);
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		최대매출_3 c= new 최대매출_3();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
	/*
	public int solution(int input1, int input2, int[] intArr) {
		int answer = 0;
		int tmp = 0;
		for(int i=0; i<input1-input2+1; i++) {
			tmp = 0;
			for(int j=i; j<i+input2; j++) {
				tmp += intArr[j];
			}
			if(tmp > answer) answer = tmp; 
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] intArr = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr[i] = in.nextInt();
		}
		System.out.println(c.solution(input1, input2, intArr));
	}
	*/
}
