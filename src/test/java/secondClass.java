import org.testng.annotations.*;

public class secondClass {

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @BeforeTest
    public void testBefore(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void testAfter(){
        System.out.println("testAfter");
    }

    @Test(priority = 1)
    public void bucarProducto(){
        System.out.println("bucarProducto");
    }

    @Test(priority = 2)
    public void agregarAlCarrito(){
        System.out.println("agregarAlCarrito");
    }
}
