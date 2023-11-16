package testCases;

import org.testng.annotations.Test;

public class TestA01 {
    @Test(parameters = {"excelPath","dataSheetName"})
    public void test01(String exce,String data){
        System.out.println(exce);
        System.out.println(data);
    }
}
