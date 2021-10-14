package Classes;

import Interfaces.Formula;

public class FormulaFactory {
    public void createConstant(Double value){
        Formula constant = new Constant(value);
    }

    public void createProduct(Formula... formulas){
        Formula constant = new Product(formulas);
    }

    public void createSum(Formula... formulas){
        Formula constant = new Sum(formulas);
    }
}
