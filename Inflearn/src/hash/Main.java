package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
/*
4. 모든 아나그램 찾기
설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

예시 입력 1 
bacaAacba
abc
예시 출력 1
3
힌트
출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */
	public int solution(String input1, String input2) {
		int answer = 0;
		Map<Character, Integer> ori_map = new HashMap<Character, Integer>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int len_1 = input1.length();
		int len_2 = input2.length();
		char[] strArr1 = input1.toCharArray();
		char[] strArr2 = input2.toCharArray();
		for(int i=0; i<len_2; i++) {
			ori_map.put(strArr2[i], 1);
		}
		for(int i=0; i<len_1-len_2+1; i++) {
			map.clear();
			for(int j=i; j<len_2+i; j++) {
				map.put(strArr1[i], map.getOrDefault(strArr1, 0)+1);
			}
			if(map.equals(ori_map)) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Main c= new Main();
		String input1 = in.next();
		String input2 = in.next();
		System.out.println(c.solution(input1, input2));
	}
}
