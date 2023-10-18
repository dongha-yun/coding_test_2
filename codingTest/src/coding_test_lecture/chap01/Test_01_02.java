package coding_test_lecture.chap01;

import java.util.Scanner;

//////// 섹션 1. String (문자열)
//////// 2. 대소문자 변환
public class Test_01_02 {

  public String solution(String str) {
    //////// Character.isLowerCase(x) : 소문자인지 확인
    //////// Character.isUpperCase(x) : 대문자인지 확인
    //////// Character.toLowerCase(x) : 소문자로 변경
    //////// Character.toUpperCase(x) : 대문자로 변경
    String answer = "";
    for (char x : str.toCharArray()) {
      if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
      else answer += Character.toLowerCase(x);
    }
    return answer;
  }


  public String solution2(String str) {
    //////// ASCII 로 판단
    //////// 대문자 : 65 ~ 90
    //////// 소문자 : 97 ~ 122
    //////// 대소문자 차이 : 32
    String answer = "";
    for (char x : str.toCharArray()) {
      //////// cast 시키지 않으면 숫자로 쌓인다 : (char) 로 강제형변환 필요
      if (x >= 65 && x <= 90) answer += (char) (x + 32);
      else answer += (char) (x - 32);
    }
    return answer;
  }


  public static void main(String[] args) {
    Test_01_02 T = new Test_01_02();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution2(str));
  }
}

