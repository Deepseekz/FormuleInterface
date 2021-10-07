package Classes;

import Interfaces.Formula;

public class Variable implements Formula
{
    private String name;
    private Double value;

    public Variable(String name, Double value)
    {
        this.name = name;
        this.value = value;
    }

    @Override
    public String asString()
    {
        return name;
    }

    @Override
    public Double asValue()
    {
        return value;
    }

    public void set(Double value){ this.value = value; }
}
