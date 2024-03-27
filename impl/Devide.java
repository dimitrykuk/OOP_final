package patterns.behavioral.strategy.solution.impl;

import patterns.behavioral.strategy.solution.ComplexNumber;


public class Devide implements Operation {
    ComplexNumber operand1;
    ComplexNumber operand2;
    public Devide(ComplexNumber operand1, ComplexNumber operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public ComplexNumber calculate() {
        double a1 = this.operand1.getValid();
        double a2 = this.operand1.getImaginary();

        double b1 = this.operand2.getValid();
        double b2 = this.operand2.getImaginary();

        double c1 = (a1*b1+a2*b2)/(Math.pow(b1,2)+Math.pow(b2,2));
        double c2 = (a2*b1-a1*b2)/(Math.pow(b1,2)+Math.pow(b2,2));

        return new ComplexNumber(c1,c2);
    }

}
