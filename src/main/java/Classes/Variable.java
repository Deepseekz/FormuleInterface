package Classes;

import Interfaces.Formula;

public class Variable implements Formula
{
    private String _name;
    private float _value;

    public Variable(String name, float value)
    {
        _name = name;
        _value = value;
    }

    @Override
    public String asString()
    {
        return _name;
    }

    @Override
    public float asValue()
    {
        return _value;
    }
}
