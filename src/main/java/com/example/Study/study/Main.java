package com.example.Study.study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  	Scanner sc = new Scanner(System.in);
	        String str = sc.next(); 
	 
	        for (int i = 0; i < str.length(); i++) { 
	            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { 
	                System.out.print(str.charAt(i)); 
	           }
	        }

	}

}
