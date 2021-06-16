package demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.transform.Result;

public class TestNgEx1 {
    @Test(priority = 4)
    public void addNumbers(){
        int a = 10;
        int b = 20;
        int expectedResult = 30;
        int actualResult = a+b;
        Assert.assertEquals(actualResult, expectedResult,
                String.format("expected was %s but actual is %s",  expectedResult, actualResult));
    }

    @Test(priority = 3, enabled = false)
    public void subtract(){
        int a = 20;
        int b = 10;
        int expectedResult = 10;
        int actualResult = a-b;
        Assert.assertEquals(actualResult, expectedResult,
                String.format("expected was %s but actual is %s",  expectedResult, actualResult));
    }

    @Test (priority = 1)
    public void multiply(){
        int a = 10;
        int b = 20;
        int expectedResult = 200;
        int actualResult = a*b;
        Assert.assertEquals(actualResult, expectedResult,
                String.format("expected was %s but actual is %s",  expectedResult, actualResult));
    }

    @Test (priority = 2, dataProvider = "getNumbers")
    public void divide(int a, int b){
        int expectedResult = 2;
        int actualResult = a/b;
        Assert.assertEquals(actualResult, expectedResult,
                String.format("expected was %s but actual is %s",  expectedResult, actualResult));
    }

    @DataProvider
    public Object[][] getNumbers(){
        Object [][] myData = new Object[3][2];
        myData[0][0] = 20;
        myData[0][1] = 10;
        myData[1][0] = 40;
        myData[1][1] = 20;
        myData[2][0] = 60;
        myData[2][1] = 30;
        return myData;
    }
}
