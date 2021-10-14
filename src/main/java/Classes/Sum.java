package Classes;

import Interfaces.Formula;

public class Sum extends VariadicOperator
{
    public Sum(Formula... formulas){

    }
    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public Double initialValue() {
        return 0d;
    }

    @Override
    public Double cumulativeValue(Double value, Double accumulator) {
        return value + accumulator;
    }
}
