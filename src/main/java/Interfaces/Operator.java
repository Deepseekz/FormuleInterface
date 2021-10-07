package Interfaces;

public interface Operator {
    public String symbol();
    public Double initialValue();
    public Double cumulativeValue(Double value, Double accumulator);
}
