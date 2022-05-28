package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 뒤집은소수_6 {
/*
6. 뒤집은 소수
설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
예시 입력 1 
9
32 55 62 20 250 370 200 30 100
예시 출력 1
23 2 73 2 3
 */
	public String solution(String[] input, int max) {
		String answer = "";
		int[] chk = new int[max+1];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=2; i<max+1; i++) {
			if(chk[i]==0) {
				map.put(i, 1);
				for(int j=i; j<max+1; j=j+i) {
					chk[j] = 1;
				}
			}
		}
		for(int i=0; i<input.length; i++) {
			String reStr = new StringBuilder(input[i]).reverse().toString();
			int sosu = Integer.parseInt(reStr);
			if(map.containsKey(sosu)) {
				answer += sosu + " ";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		뒤집은소수_6 c= new 뒤집은소수_6();
		int input1 = in.nextInt();
		String[] input2 = new String[input1];
		int max = 0;
		for(int i=0; i<input1; i++) {
			input2[i] = in.next();
			int tmp = Integer.parseInt(input2[i]);
			if(tmp > max) {
				max = tmp;
			}
		}
		System.out.println(c.solution(input2, max));
	}
}
