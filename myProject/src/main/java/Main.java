import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "/home/anna/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

// открыть браузер и развернуть окно на весь экран
        driver.get("https://preprod.aventusgroup.ro/admin/login");
        driver.manage().window().maximize();

        // ожидание появление эл-та
        //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        // подтягивание в тест класса
        loginPage lg = new loginPage();
        lg.LoginPage(driver);

        sidebar sb = new sidebar();
        sb.sidebar(driver);

    }
}
