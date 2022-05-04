import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    //конструктор класса, занимающийся инициализацией полей класса

    public WebDriver driver;
    public void LoginPage (WebDriver driver) throws InterruptedException {
        initElements(driver);
        this.driver = driver;

        //Thread.sleep(3000);

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("admin");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background-color:RGBA(87, 87, 49, 1)')", username);

        WebElement passwd = driver.findElement(By.id("password"));
        passwd.click();
        passwd.sendKeys("showmethemoney");

        WebElement Login = driver.findElement(By.id("submit"));
        Login.click();



    }

    private void initElements(WebDriver driver) {
    }

}
