package org.example;

public class Calculator {

  public double calculate(double firstInput, String operator, double secondInput) {
    return switch (operator) {
      case "+" -> firstInput + secondInput;
      case "-" -> firstInput - secondInput;
      case "*" -> firstInput * secondInput;
      case "/" -> {
        // 分母が0の時にエラーを返す
        if (secondInput != 0) {
          yield firstInput / secondInput;
        } else {
          System.out.println("エラー: 0で割ることはできません");
          yield Double.NaN;
        }
      }
      default -> Double.NaN;
    };
  }
}
