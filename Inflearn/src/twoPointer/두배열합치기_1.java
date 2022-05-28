package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두배열합치기_1 {
/*
1. 두 배열 합치기
설명
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
오름차순으로 정렬된 배열을 출력합니다.

예시 입력 1 
3
1 3 5
5
2 3 6 7 9
예시 출력 1
1 2 3 3 5 6 7 9
 */
	public String solution(int[] input1, int[] input2) {
		String answer = "";
		int p1 = 0;
		int p2 = 0;
		while(p1< input1.length && p2<input2.length) {
			if(input1[p1] < input2[p2]) {
				answer += input1[p1++] + " ";
			}else {
				answer += input2[p2++] + " ";
			}
		}
		if(p1 == input1.length) {
			for(int i=p2; i<input2.length; i++) {
				answer += input2[p2++] + " ";
			}
		}else {
			for(int i=p1; i<input1.length; i++) {
				answer += input1[p1++] + " ";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		두배열합치기_1 c= new 두배열합치기_1();
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
	/*public String solution(ArrayList<Integer> input1, ArrayList<Integer> input2) {
		String answer = "";
		ArrayList<Integer> addArr = new ArrayList<Integer>();
		addArr.addAll(input1);
		addArr.addAll(input2);
		Collections.sort(addArr);
		for(int i=0; i<addArr.size(); i++) {
			answer += addArr.get(i) + " ";
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		int input1 = in.nextInt();
		ArrayList<Integer> intArr1 = new ArrayList<Integer>();
		for(int i=0; i<input1; i++) {
			intArr1.add(in.nextInt());
		}
		int input2 = in.nextInt();
		ArrayList<Integer> intArr2 = new ArrayList<Integer>();
		for(int i=0; i<input2; i++) {
			intArr2.add(in.nextInt());
		}
		System.out.println(c.solution(intArr1, intArr2));
	}*/
}
