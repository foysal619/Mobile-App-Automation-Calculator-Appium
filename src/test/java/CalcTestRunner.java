import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {
    @Test(priority = 1, description = "Do Summation: 321+123=444")
    public void doSum(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doSum(3,2,1,1,2,3);
        String resExpected="444";
        Assert.assertTrue(res.contains(resExpected));
    }
    @Test(priority = 2, description = "Do Substraction: 512-314=198")
    public void doSub(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doSub(5,1,2,3,1,4);
        String resExpected="198";
        Assert.assertTrue(res.contains(resExpected));
    }
    @Test(priority = 3, description = "Do Multiplication: 715*65=46475")
    public void doMul(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doMul(7,1,5,6,5);
        String resExpected="46475";
        Assert.assertTrue(res.contains(resExpected));
    }
    @Test(priority = 4, description = "Do Division: 1560/30=52")
    public void doDiv(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doDiv(1,5,6,0,3, 0);
        String resExpected="52";
        Assert.assertTrue(res.contains(resExpected));
    }
    @Test(priority = 5, description = "Do Series 1: 100/10*5-10+6=100")
    public void doSeries1(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doSeries1(1,0,0,1,0,5,1,0,6,0);
        String resExpected="100";
        Assert.assertTrue(res.contains(resExpected));
    }
    @Test(priority = 6, description = "Do Series 2: 50+10-20*2+10/2=25")
    public void doSeries2(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doSeries2(5,0,1,0,2,0,2,1,0,2);
        String resExpected="25";
        Assert.assertTrue(res.contains(resExpected));
    }
    @AfterMethod
    public void clearScr(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
