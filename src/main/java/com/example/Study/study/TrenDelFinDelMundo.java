package com.example.Study.study;

import java.util.Scanner;

public class TrenDelFinDelMundo {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        // 역 좌표의 초기값을 적절히 큰 값으로 설정
        int x = 1001;
        int y = 1001;
        
        for (int i = 0; i < N; i++) {
            int x_ = scan.nextInt();
            int y_ = scan.nextInt();
            if (y_ < y) {
                x = x_;
                y = y_;
            } else if (y_ == y && x_ < x) {
                x = x_;
            }
        }
        System.out.println(x + " " + y);
        //?
    }
}
