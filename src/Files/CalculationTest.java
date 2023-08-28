package Files;

import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CalculationTest extends ParameterDriver {
    @Test
    public void test3(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calButton = driver.findElement(By.id("calculatetest"));
        calButton.click();

        Random random = new Random();
        WebElement firstInbox = driver.findElement(By.cssSelector("input[id=\"number1\"]"));
        int a = random.nextInt(10);
        firstInbox.sendKeys(String.valueOf(a));

        WebElement secondInbox = driver.findElement(By.cssSelector("input[id=\"number2\"]"));
        int b = random.nextInt(10);
        secondInbox.sendKeys(String.valueOf(b));

        WebElement calButton2 = driver.findElement(By.id("calculate"));
        calButton2.click();

        String expectedResult = String.valueOf(a + b);
        WebElement actResult = driver.findElement(By.id("answer"));
        Assert.assertTrue(actResult.getText().equals(expectedResult));
    }
}
