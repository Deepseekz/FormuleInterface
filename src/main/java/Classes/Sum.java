package Classes;

import Interfaces.Formula;

public class Sum implements Formula
{
    private final Formula[] _terms;

    public Sum(Formula[] terms)
    {
        _terms = terms;
    }

    public Sum(Formula firstTerm, Formula secondTerm)
    {
        _terms = new Formula[2];
        _terms[0] = firstTerm;
        _terms[1] = secondTerm;
    }

    private float operation()
    {
        float result = 0f;
        for (Formula term : _terms)
        {
            result += term.asValue();
        }
        return result;
    }

    @Override
    public String asString()
    {
        int lastTerm = _terms.length - 1; // used to avoid a + sign after the last term

        StringBuilder result = new StringBuilder();
        for (int k = 0 ; k < lastTerm ; k++)
        {
            result.append(_terms[k].asString());
            result.append("+");
        }
        result.append(_terms[lastTerm].asString());

        return "(" + result + ")";
    }

    @Override
    public float asValue()
    {
        return operation();
    }
}
