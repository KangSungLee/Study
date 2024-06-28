package com.example.Study.study;

import java.util.*;

public class MazeEscape {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 후보의 수 T를 읽음
        int T = scanner.nextInt();

        // 각 후보가 받은 표의 수를 읽고 출력
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            System.out.println(countVotes(n));
        }

        scanner.close();
    }

    // 주어진 표 수에 따라 칠판에 표시될 문자열을 반환하는 메소드
    public static String countVotes(int n) {
        StringBuilder result = new StringBuilder();
        int completeSets = n / 5;  // '++++ '의 개수
        int remainingVotes = n % 5;  // 남은 '|'의 개수

        // '++++ ' 추가
        for (int i = 0; i < completeSets; i++) {
            result.append("++++ ");
        }

        // 남은 '|' 추가
        for (int i = 0; i < remainingVotes; i++) {
            result.append("|");
        }

        return result.toString().trim();
    }
}
