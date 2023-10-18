package coding_test_lecture.chap01;

import java.util.Scanner;

//////// 섹션 1. String (문자열)
//////// 1. 문자 찾기
//////// 백준 스타일 : 클래스명을 Main 으로 변경 필요
////////             -> 최종 제출시 Test... 로 설정한 부분 다 Main 으로 변경해서 입력 필요함
//////// 프로그래머스 스타일 : solution 메소드 설정해서 수행
public class Test_01_01 {
  public int solution(String str, char t) {
    int answer = 0;

    //////// 전부 대문자로 변환
    str = str.toUpperCase();
    t = Character.toUpperCase(t);

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == t) answer++;
    }

    return answer;
  }


  public int solution2(String str, char t) {
    int answer = 0;
    str = str.toUpperCase();
    t = Character.toUpperCase(t);

    //////// 향상된 for 문
    //////// .toCharArray() : string 을 문자열배열로 변경
    for (char x : str.toCharArray()) {
      if (x == t) answer++;
    }

    return answer;
  }


  public static void main(String[] args) {
    Test_01_01 T = new Test_01_01();

    //////// Scanner 로 받아오기
    Scanner kb = new Scanner(System.in);

    //////// Scanner 로 받아온 것 String 으로 담기
    String str = kb.next();

    //////// Scanner 로 받아온 것 char 으로 담기
    char c = kb.next().charAt(0);

    System.out.println(T.solution2(str, c));
  }
}