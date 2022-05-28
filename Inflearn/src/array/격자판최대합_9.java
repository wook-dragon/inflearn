package array;

import java.util.Scanner;

public class 격자판최대합_9 {
/*
9. 격자판 최대합
설명
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
Image1.jpg
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
최대합을 출력합니다.

예시 입력 1 
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
예시 출력 1
155
 */
	public int solution(int input1, int[][] input2) {
		int answer = 0;
		for(int i=0; i<input1; i++) {
			int tmp = 0;
			for(int j=0; j<input1; j++) {
				tmp += input2[i][j];
			}
			if(tmp > answer) answer = tmp;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		격자판최대합_9 c= new 격자판최대합_9();
		int input1 = in.nextInt();
		int[][] input2 = new int[input1][input1];
		for(int i=0; i<input1; i++) {
			for(int j=0; j<input1; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		System.out.println(c.solution(input1, input2));
	}
}
