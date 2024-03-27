package patterns.behavioral.strategy.solution.impl;

import patterns.behavioral.strategy.solution.ComplexNumber;

public class Summa implements Operation {

    ComplexNumber operand1;
    ComplexNumber operand2;
    public Summa(ComplexNumber operand1, ComplexNumber operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public ComplexNumber calculate() {
        double a = this.operand1.getValid() + this.operand1.getImaginary();
        double b = this.operand2.getValid() + this.operand2.getImaginary();
        return new ComplexNumber(a,b);
    }

}
