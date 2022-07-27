package testng.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }

    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test //(enabled = false)
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }


    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }

}
