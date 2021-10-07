package Classes;

import Interfaces.Formula;
import Interfaces.Operator;

public class Sum implements Operator
{

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
