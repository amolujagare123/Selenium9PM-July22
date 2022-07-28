package testng.Demo;

import org.testng.annotations.*;

public class ClassTwo {

    @BeforeSuite
    public void beforeMySuiteTest()
    {
        System.out.println("beforeMySuiteTest");
    }

    @AfterSuite
    public void afterMySuiteTest()
    {
        System.out.println("afterMySuiteTest");
    }

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test (groups = "email")
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }


    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }

}
