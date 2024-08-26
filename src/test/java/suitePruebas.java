import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class suitePruebas {
    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(url);
    }

    @Test
    public void ingresarUsuarioYPassword() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
    }

    @Test
    public void presionarIngresar(){
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Test
    public void comprarProducto(){
        System.out.println("comprarProducto");
       // driver.findElement(By.id("LocatorNoExiste")).click();
    }

    @Test(dependsOnMethods ={"comprarProducto"}, alwaysRun = true )
    public void facturarProducto(){
        System.out.println("facturarProducto");
    }
}
