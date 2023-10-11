package coding_test_lecture.chap01;

import java.util.Scanner;

public class Test_01_03 {
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

  public static void main(String[] args) {
    Test_01_03 T = new Test_01_03();
    Scanner kb = new Scanner(System.in);

    //////// .nextList() : 문장으로 입력받아야 하므로
    String str = kb.nextLine();

    System.out.println(T.solution(str));
  }
}
