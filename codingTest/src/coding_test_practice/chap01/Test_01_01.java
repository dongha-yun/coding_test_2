package coding_test_practice.chap01;

import java.util.Scanner;

//////// 섹션 1. String (문자열)
//////// 1. 문자 찾기
public class Test_01_01 {
  public static void main(String[] args) {
    Test_01_01 T = new Test_01_01();
    Scanner in = new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
    System.out.println(str);
  }
}