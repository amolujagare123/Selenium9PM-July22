package testng.Demo;

import org.testng.annotations.Test;

public class ClassThree {

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }

    @Test (groups = "email")
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
