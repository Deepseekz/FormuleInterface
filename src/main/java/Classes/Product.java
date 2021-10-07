package Classes;

import Interfaces.Formula;
import Interfaces.Operator;

public class Product implements Operator
{
    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public Double initialValue() {
        return 1d;
    }

    @Override
    public Double cumulativeValue(Double value, Double accumulator) {
        return value * accumulator;
    }
}
