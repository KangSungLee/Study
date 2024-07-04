package com.example.Study.study;

import org.apache.ibatis.javassist.compiler.ast.ArrayInit;

public class Solution2 {
	
	public static void main(String[] args) {
		 int[] numbers = {34, 5, 71, 29, 100, 34};	
		 int n = 123;
	        int answer = 0;
	        for (int i = 0; i < numbers.length; i++){
	            if (n >= answer){
	                answer += numbers[i];
	            } else {
	                break;
	            }
	        }
	        System.out.println(answer);
	    }
}
	