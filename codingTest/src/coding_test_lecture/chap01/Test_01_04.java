package coding_test_lecture.chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_01_04 {
  //////// StringBuilder 활용
  public ArrayList<String> solution(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();

    for (String x : str) {
      //////// 1. StringBuilder 라는 문자열 객체를 만들고
      //////// 2. .reverse() : 문자열 역순 처리
      //////// 3. .toString() : String 화 시켜야 String 객체로 들어감
      //////// TODO : String 이 있는데 왜 StringBuilder 라는 객체를 지원하는지 알아보기
      // String : 변경사항 생기는 경우 새로운 객체 생성됨 (String 으로 하나의 객체를 만들어 놓으면 불변임)
      // StringBuilder : 변경사항 생겨도 처음 만든 객체를 활용해서 진행함
      //   -> 메모리 낭비 X / 더 가벼움 -> String 연산이 많아지면 StringBuilder 사용한다
      String tmp = new StringBuilder(x).reverse().toString();

      //////// .add() : ArrayList 에 추가
      answer.add(tmp);
    }

    return answer;
  }

  //////// 앞뒤 짝지어 뒤집기
  public ArrayList<String> solution2(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();

    for (String x : str) {
      //////// 문자 배열로 쪼개기
      char[] s = x.toCharArray();
      int lt = 0, rt = x.length() - 1;
      while (lt < rt) {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }

      //////// s 라는 문자 배열을 String 화 시켜줌
      //////// .valueOf() : static 으로 선언된 클래스 메소드
      ////////    -> 따라서 객체. 이 아니라 클래스. 으로 접근 가능하다 -> String.valueOf()
      String tmp = String.valueOf(s);
      answer.add(tmp);
    }

    return answer;
  }

  public static void main(String[] args) {
    Test_01_04 T = new Test_01_04();
    Scanner kb = new Scanner(System.in);

    //////// 입력받는 것이 숫자인 경우
    int n = kb.nextInt();

    //////// n 개 문자열 받으므로 문자열 배열 설정
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = kb.next();
    }

    for (String x : T.solution2(n, str)) {
      System.out.println(x);
    }
  }
}
