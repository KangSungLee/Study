package com.example.Study.study;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// 스캐너 셋티
		Scanner sc = new Scanner(System.in);
		// 영문자 스탠
        String a = sc.next();
        // 한자리수씩 체크하기 위해 a문자열을 char(character) 어레이로 변환
        char[] c = a.toCharArray();
        // 변환한 대소문자를 새로운 문자열에 셋팅하기 위해 선언
		String str = "";
		// 반복문 c의 갯수만큼
		for (int i = 0 ; i < c.length; i++) {
			// 차의 c[n]번째가 대문자이면
			if (Character.isUpperCase(c[i])) {
				// 소문자로 str에 더하기
				str += Character.toLowerCase(c[i]);
			} else {
				// 대문자로 str에 더하기
				str += Character.toUpperCase(c[i]);
			}
		}
		// 변환한값 출력
        System.out.println(str);
	}
}