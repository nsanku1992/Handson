package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgEx {

    /**
     * My first testng assert equals creation.
     */
    @Test(description = "My first testNG assert. creation", testName = "My Hello")
    public void myHello(){
        String actualText = "MyHello";
        String expectedText = "MyHello";

        Assert.assertEquals(actualText, expectedText,
                String.format("Expected was %s, but displayed is %s", expectedText, actualText));
    }
}
