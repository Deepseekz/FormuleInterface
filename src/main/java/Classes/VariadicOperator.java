package Classes;

import Interfaces.Formula;

import java.util.ArrayList;

public abstract class VariadicOperator implements Formula{
    Formula[] formulas;
    Operator operator;

    public VariadicOperator(Formula... formulas) {
        this.formulas = formulas;
        this.operator = operator;
    }

    public String asString(){
        StringBuilder result = new StringBuilder();

        for (Formula element : formulas)
        {
            result.append(element.asString()
            + operator.symbol());
        }

        return "(" + result + ")";
    }

    public Double asValue(){
        Double result = operator.initialValue();
        for (Formula term : formulas)
        {
            operator.cumulativeValue(result, term.asValue());
        }
        return result;
    }

    public double
}
