import Classes.Product;
import Classes.Sum;
import Classes.Variable;
import Interfaces.Formula;
import org.junit.Assert;
import org.junit.Test;

public class TestFormula
{
    Formula var = new Variable("x", 2);
    Formula var2 = new Variable("y", 4);
    Formula var3 = new Variable("z", 2.5f);

    Formula sum = new Sum(var2, var3); // 6.5f

    Formula product = new Product(var, sum); // 13.0f


    @Test
    public void testVariableAsString()
    {
        Assert.assertEquals("x", var.asString());
    }

    @Test
    public void testVariableAsValue()
    {
        Assert.assertEquals(2.0f, var.asValue(), 0);
    }

    @Test
    public void testSumAsString()
    {
        Assert.assertEquals("(y+z)", sum.asString());
    }

    @Test
    public void testSumAsValue()
    {
        Assert.assertEquals(6.5f, sum.asValue(), 0);
    }

    @Test
    public void testProductAsString()
    {
        Assert.assertEquals("(x*(y+z))", product.asString());
    }

    @Test
    public void testProductAsValue()
    {
        Assert.assertEquals(13.0f, product.asValue(), 0);
    }
}
