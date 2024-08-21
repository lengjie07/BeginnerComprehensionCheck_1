package org.example;

public class Calculator {

  public double calculate(double number1, String operator, double number2) {
    return switch (operator) {
      case "+" -> number1 + number2;
      case "-" -> number1 - number2;
      case "*" -> number1 * number2;
      case "/" -> {
        // 分母が0の時にエラーを返す
        if (number2 != 0) {
          yield number1 / number2;
        } else {
          System.out.println("エラー: 0で割ることはできません");
          yield Double.NaN;
        }
      }
      default -> Double.NaN;
    };
  }
}