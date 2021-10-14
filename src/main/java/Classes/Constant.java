package Classes;

import Interfaces.Formula;

public class Constant implements Formula {
    private Double value;

    public Constant(Double value){
        this.value = value;
    }

    @Override
    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public Double asValue() {
        return value;
    }
}
