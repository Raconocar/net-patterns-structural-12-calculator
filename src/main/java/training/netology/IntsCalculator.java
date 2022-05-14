package training.netology;

public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula fSum = new Calculator.Formula();
        fSum.addOperand(arg0);
        fSum.addOperand(arg1);
        fSum.calculate(Calculator.Operation.SUM);
        return (int)fSum.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula fMul = new Calculator.Formula();
        fMul.addOperand(arg0);
        fMul.addOperand(arg1);
        fMul.calculate(Calculator.Operation.MULT);
        return (int)fMul.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula fPow = new Calculator.Formula();
        fPow.addOperand(a);
        fPow.addOperand(b);
        fPow.calculate(Calculator.Operation.POW);
        return (int)fPow.result();
    }
}
