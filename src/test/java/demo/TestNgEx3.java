package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgEx3 {
    @Test(dataProvider = "dataCreation")
    public void printTable(int x){
        System.out.println("x = " + x);
    }
    @DataProvider
    public Object[][] dataCreation(){
        Object[][] ObjDataCreation = new Object[3][1];
        ObjDataCreation [0][0] = 10;
        ObjDataCreation [1][0] = 20;
        ObjDataCreation [2][0] = 30;
return ObjDataCreation;
    }
}
