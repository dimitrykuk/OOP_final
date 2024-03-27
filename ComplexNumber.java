package patterns.behavioral.strategy.solution;

public class ComplexNumber {
    double valid;
    double imaginary;
    public ComplexNumber(double valid, double imaginary){
        this.valid = valid;
        this.imaginary = imaginary;

    }
    public double getValid(){
        return this.valid;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    @Override
    public String toString() {
        System.out.println();
        return String.format("%f + %fi", this.valid, this.imaginary);
    }
}
