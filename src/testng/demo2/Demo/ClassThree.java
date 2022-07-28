package testng.demo2.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"url","username","password"})
    @Test
    public void classThreeTest1(String p1,String p2,String p3)
    {
        System.out.println("url="+p1);
        System.out.println("username="+p2);
        System.out.println("password="+p3);   System.out.println("classThreeTest1");
    }

    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }


    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }

}
