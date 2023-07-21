import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    WebElement btn1;
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    WebElement btn2;
    @FindBy(id = "com.google.android.calculator:id/digit_3")
    WebElement btn3;
    @FindBy(id = "com.google.android.calculator:id/digit_4")
    WebElement btn4;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    WebElement btn5;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    WebElement btn6;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    WebElement btn7;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    WebElement btn8;
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    WebElement btn9;
    @FindBy(id = "com.google.android.calculator:id/digit_0")
    WebElement btn0;
    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnMinus;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;
    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClear;
    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSum(int a, int b, int c, int d, int e, int f){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+f)).click();
        btnEqual.click();
        return txtResult.getText();
    }
    public String doSub(int a, int b, int c, int d, int e, int f){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+f)).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doMul(int a, int b, int c, int d, int e){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doDiv(int a, int b, int c, int d, int e, int f){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+f)).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doSeries1(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+f)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+g)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+h)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+i)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+j)).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doSeries2(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+e)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+f)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+g)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+h)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+i)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+j)).click();
        btnEqual.click();
        return txtResult.getText();
    }

}
