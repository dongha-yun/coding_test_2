package coding_test_lecture.chap01;

import java.util.Scanner;

public class Test_01_03 {
  //////// split 활용
  public String solution(String str) {
    String answer = "";

    //////// Integer.MIN_VALUE : 처음에는 가장 작은 값으로 초기화
    int m = Integer.MIN_VALUE;

    //////// split 으로 String 배열 처리
    String[] s = str.split(" ");

    for (String x : s) {
//      System.out.println(x);
      int len = x.length();
      if (len > m) {
        m = len;
        answer = x;
      }
    }

    return answer;
  }

  //////// indexOf, substring 활용
  public String solution2(String str) {
    String answer = "";

    //////// Integer.MIN_VALUE : 처음에는 가장 작은 값으로 초기화
    int m = Integer.MIN_VALUE, pos;

    //////// 띄어쓰기의 위치를 알려줌
    //////// 띄어쓰기를 발견 못하면 -1 return
    while ((pos = str.indexOf(" ")) != -1) {
      String tmp = str.substring(0, pos);
      int len = tmp.length();
      if (len > m) {
        m = len;
        answer = tmp ;
      }
      str = str.substring(pos + 1);
    }

    ///////// 위의 while 에서 마지막 단어는 처리되지 못하므로 아래 구문 추가 필요
    if (str.length() > m) answer = str;

    return answer;
  }

  public static void main(String[] args) {
    Test_01_03 T = new Test_01_03();
    Scanner kb = new Scanner(System.in);

    //////// .nextList() : 문장으로 입력받아야 하므로
    String str = kb.nextLine();

    System.out.println(T.solution2(str));
  }
}
