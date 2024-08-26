import org.testng.annotations.*;

public class suite1 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    @Test
    public void test8(){
        System.out.println("test8");
    }

    @Test
    public void test9(){
        System.out.println("test9");
    }
}
