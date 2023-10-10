package coding_test_lecture.chap01;

import java.util.Scanner;

public class Test_01_01 {
}

//////// 1. 문자 찾기
class Main {
  public int solution(String str, char t) {
    int answer = 0;

    //////// 전부 대문자로 변환
    str = str.toUpperCase();
    t = Character.toUpperCase(t);

    //////// 향상된 for 문
    //////// .toCharArray() : string 을 문자열배열로 변경
    for (char x : str.toCharArray()) {
      if (x == t) answer++;
    }
//    for (int i = 0; i < str.length(); i++) {
//      if (str.charAt(i) == t) answer++;
//    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();

    //////// Scanner 로 받아오기
    Scanner kb = new Scanner(System.in);

    //////// Scanner 로 받아온 것 String 으로 담기
    String str = kb.next();

    //////// Scanner 로 받아온 것 char 으로 담기
    char c = kb.next().charAt(0);

    System.out.println(T.solution(str, c));
  }
}
