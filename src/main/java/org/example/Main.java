package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double number1 = 0;
    double number2 = 0;

    // 1番目の数字を入力
    // 数字以外を入力したらエラーを返す
    System.out.print("1番目の数字を入力してください: ");
    try {
      number1 = scanner.nextDouble();
    } catch (InputMismatchException e) {
      System.out.println("エラー: 数字を入力してください");
      return;
    }

    // 演算子を入力
    // 演算子以外を入力したらエラーを返す
    System.out.print("演算子を入力してください (+, -, *, /): ");
    String operator = scanner.next();

    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals(
        "/")) {
      System.out.println("エラー: 無効な演算子です");
      return;
    }

    // 2番目の数字を入力
    // 数字以外を入力したらエラーを返す
    System.out.print("2番目の数字を入力してください: ");
    try {
      number2 = scanner.nextDouble();
    } catch (InputMismatchException e) {
      System.out.println("エラー: 数字を入力してください");
      return;
    }

    // calculateメソッドの呼び出し
    Calculator calculator = new Calculator();
    double result = calculator.calculate(number1, operator, number2);

    // 結果の表示
    if (!Double.isNaN(result)) {
      System.out.println("計算結果: " + number1 + " " + operator + " " + number2 + " = " + result);
    }
  }
}
