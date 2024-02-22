package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = target.newFormula();
        return (int) formula.addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }

    @Override
    public int sub(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
    }

    @Override
    public int div(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result();
    }
}
