package patterns.behavioral.strategy.solution.Viewer;

import patterns.behavioral.strategy.solution.ComplexNumber;
import patterns.behavioral.strategy.solution.impl.Devide;
import patterns.behavioral.strategy.solution.impl.Multiplie;
import patterns.behavioral.strategy.solution.impl.Operation;
import patterns.behavioral.strategy.solution.impl.Summa;

import java.util.Scanner;
public class Viewer {
    private ComplexNumber result;

    public void calculate() {

        ComplexNumber operand1 = new ComplexNumber(Double.parseDouble(prompt("Enter first valid number: ")),
                Double.parseDouble(prompt("Enter first imaginary number: ")));
        char operator = prompt("Enter math operation (+ / *): ").charAt(0);
        ComplexNumber operand2 = new ComplexNumber(Double.parseDouble(prompt("Enter second valid number: ")),
                Double.parseDouble(prompt("Enter second imaginary number: ")));

        switch (operator) {
            case '+':
                Operation operat = new Summa(operand1, operand2);
                this.result = operat.calculate();

                break;
            case '/':
                Operation oper = new Devide(operand1, operand2);
                this.result = oper.calculate();
                break;
            case '*':
                Operation operation = new Multiplie(operand1, operand2);
                this.result = operation.calculate();
                break;
        }
    }
    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }

    public void showValue(){
        System.out.println(this.result);
    }

}
