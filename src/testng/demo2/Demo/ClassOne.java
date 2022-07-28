package testng.demo2.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {


    @Parameters({"url","username","password"})
    @Test
    public void classOneTest1(String p1,String p2,String p3)
    {
        System.out.println("url="+p1);
        System.out.println("username="+p2);
        System.out.println("password="+p3);

        System.out.println("classOneTest1");
    }

    @Test
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
