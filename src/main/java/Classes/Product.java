package Classes;

import Interfaces.Formula;

public class Product extends VariadicOperator
{
    public Product(Formula... formulas){

    }
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
