package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 공통원소구하기_2 {
/*
2. 공통원소 구하기
설명
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.

출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

예시 입력 1 
5
1 3 9 5 2
5
3 2 5 7 8
예시 출력 1
2 3 5
 */
	public String solution(int[] input1, int[] input2) {
		String answer = "";
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		for(int i=0; i<input1.length; i++) {
			for(int j=0; j<input2.length; j++) {
				if(input1[i]==input2[j]) {
					intArr.add(input2[j]);
				}
			}
		}
		Collections.sort(intArr);
		for(int i=0; i<intArr.size(); i++) {
			answer += intArr.get(i) + " ";
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		공통원소구하기_2 c= new 공통원소구하기_2();
		int input1 = in.nextInt();
		int[] intArr1 = new int[input1];
		for(int i=0; i<input1; i++) {
			intArr1[i] = in.nextInt();
		}
		int input2 = in.nextInt();
		int[] intArr2 = new int[input2];
		for(int i=0; i<input2; i++) {
			intArr2[i] = in.nextInt();
		}
		System.out.println(c.solution(intArr1, intArr2));
	}
}
