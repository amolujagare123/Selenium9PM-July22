package testng.demo2.Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {



    @Parameters({"url","username","password"})
    @Test
    public void classTwoTest1(String p1,String p2,String p3)
    {
        System.out.println("url="+p1);
        System.out.println("username="+p2);
        System.out.println("password="+p3);

        System.out.println("classTwoTest1");
    }

    @Test
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
