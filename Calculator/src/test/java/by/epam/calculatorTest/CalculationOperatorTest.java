package by.epam.calculatorTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationOperatorTest {

    @Test
    public void testSumOne(){
        Assert.assertEquals(Calculator.sum(2.0,3.0),5.0);
    }
    @Test
    public void testSumTwo(){
        Assert.assertEquals(Calculator.sum(-2.0,3.0),1.0);
    }
    @Test
    public void testSumTree(){
        Assert.assertEquals(Calculator.sum(0.0,0.0),0.0);
    }
    @Test
    public void testSumFour(){
        Assert.assertNotSame(Calculator.sum(2.0,3.0),5.0);
    }
    @Test
    public void testSumFive(){
        Assert.assertNotEquals(Calculator.sum(0.0,0.0),1.0);
    }

    @Test
    public void testSubtractionOne(){
        Assert.assertEquals(Calculator.subtraction(2.0,3.0),-1.0);
    }
    @Test
    public void testSubtractionTwo(){
        Assert.assertEquals(Calculator.subtraction(-2.0,3.0),-5.0);
    }
    @Test
    public void testSubtractionTree(){
        Assert.assertEquals(Calculator.subtraction(0.0,0.0),0.0);
    }
    @Test
    public void testSubtractionFour(){
        Assert.assertNotSame(Calculator.subtraction(2.0,3.0),-1.0);
    }
    @Test
    public void testSubtractionFive(){
        Assert.assertNotEquals(Calculator.subtraction(0.0,0.0),1.0);
    }

    @Test
    public void testMultiplicationOne(){
        Assert.assertEquals(Calculator.multiplication(2.0,3.0),6.0);
    }
    @Test
    public void testMultiplicationTwo(){
        Assert.assertEquals(Calculator.multiplication(-2.0,3.0),-6.0);
    }
    @Test
    public void testMultiplicationTree(){
        Assert.assertEquals(Calculator.multiplication(0.0,0.0),0.0);
    }
    @Test
    public void testMultiplicationFour(){
        Assert.assertNotSame(Calculator.multiplication(2.0,3.0),-1.0);
    }
    @Test
    public void testMultiplicationFive(){
        Assert.assertNotEquals(Calculator.multiplication(0.0,0.0),1.0);
    }
    @Test
    public void testDivisionOne(){
        Assert.assertEquals(Calculator.division(10.0,5.0),2.0);
    }
    @Test
    public void testDivisionTwo(){
        Assert.assertEquals(Calculator.division(-6.0,3.0),-2.0);
    }
    @Test
    public void testDivisionTree(){
        Assert.assertEquals(Calculator.division(0.0,1.0),0.0);
    }
    @Test
    public void testDivisionFour(){
        Assert.assertNotSame(Calculator.division(2.0,2.0),5.0);
    }
    @Test
    public void testDivisionFive(){
        Assert.assertNotEquals(Calculator.division(0.0,15.0),1.0);
    }

}
