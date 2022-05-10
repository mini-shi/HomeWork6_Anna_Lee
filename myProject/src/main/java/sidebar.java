import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sidebar {
    public WebDriver driver;
    public void sidebar(WebDriver driver) throws InterruptedException {
        initElements(driver);
        this.driver = driver;
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.findElement(By.linkText("Applications")).click();
        driver.findElement(By.linkText("All applications and loans")).click();
        driver.findElement(By.linkText("New")).click();
        driver.findElement(By.linkText("Awaiting customer signature")).click();
        driver.findElement(By.linkText("Confirmed")).click();

        driver.findElement(By.linkText("Loans")).click();
        driver.findElement(By.linkText("Processing")).click();
        driver.findElement(By.linkText("Processing error")).click();
        driver.findElement(By.linkText("Active")).click();
        driver.findElement(By.linkText("Prolongated")).click();
        driver.findElement(By.linkText("Overdue")).click();
        driver.findElement(By.linkText("Redeemed")).click();
        driver.findElement(By.linkText("Sold")).click();

        driver.findElement(By.linkText("Collection")).click();
        driver.findElement(By.linkText("All overdue Loans")).click();
        driver.findElement(By.linkText("Pre")).click();
        driver.findElement(By.linkText("Soft")).click();
        driver.findElement(By.linkText("Hard")).click();
        driver.findElement(By.linkText("Lfo")).click();
        driver.findElement(By.linkText("Lfo+")).click();
        driver.findElement(By.linkText("Outsource")).click();
        driver.findElement(By.linkText("Legal")).click();
        driver.findElement(By.linkText("Income")).click();
        driver.findElement(By.linkText("Report assign collector")).click();
        driver.findElement(By.linkText("Action tree")).click();
        driver.findElement(By.linkText("Collection")).click();
        driver.findElement(By.linkText("Motivators")).click();


        driver.findElement(By.linkText("Credit cards")).click();
        driver.findElement(By.linkText("MAIB cards transactions")).click();

        driver.findElement(By.linkText("Customers")).click();
        driver.findElement(By.linkText("All customers")).click();
        driver.findElement(By.linkText("Duplicate registrations")).click();
        driver.findElement(By.linkText("Unfinished registrations")).click();
        driver.findElement(By.linkText("Blacklist")).click();

        driver.findElement(By.cssSelector(".treeview:nth-child(6) span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".menu-open .first > a")).click();

        driver.findElement(By.linkText("History")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.linkText("Online report")).click();
        driver.findElement(By.linkText("Contacts report")).click();
        driver.findElement(By.linkText("Auto assign verifier")).click();

        driver.findElement(By.cssSelector(".treeview:nth-child(7) span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".menu-open > .active a")).click();

        driver.findElement(By.linkText("Partners")).click();
        driver.findElement(By.linkText("Partners/Offline")).click();
        driver.findElement(By.linkText("Employes")).click();
        driver.findElement(By.linkText("Goods categories")).click();
        driver.findElement(By.linkText("Partner report")).click();
        driver.findElement(By.linkText("Report by loan requests")).click();

        driver.findElement(By.linkText("Marketing")).click();
        driver.findElement(By.linkText("Audiences")).click();

        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.linkText("Administrators")).click();
        driver.findElement(By.linkText("Global settings")).click();
        driver.findElement(By.linkText("Affiliates")).click();
        driver.findElement(By.linkText("Reminder setup")).click();
        driver.findElement(By.linkText("Email reminder setup")).click();
        driver.findElement(By.linkText("Regions")).click();
        driver.findElement(By.linkText("Discounts")).click();
        driver.findElement(By.linkText("Products")).click();
        driver.findElement(By.linkText("Comment style")).click();
        driver.findElement(By.linkText("SMS Senders")).click();
        driver.findElement(By.linkText("Statements")).click();
        driver.findElement(By.linkText("Agreement templates")).click();
        driver.findElement(By.linkText("Certificate templates")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("SMS templates")).click();
        driver.findElement(By.linkText("Email templates")).click();

        driver.findElement(By.linkText("Reports")).click();
        // Thread.sleep(3000);
        driver.findElement(By.linkText("Affiliates - users")).click();
        driver.findElement(By.linkText("Affiliates - loans")).click();
        driver.findElement(By.linkText("Affiliates - applications")).click();
        driver.findElement(By.linkText("Summary report")).click();
        driver.findElement(By.linkText("Cashflow report")).click();
        driver.findElement(By.linkText("Giveout report")).click();
        driver.findElement(By.linkText("SMS report")).click();
        driver.findElement(By.linkText("Email report")).click();
        driver.findElement(By.linkText("Income report")).click();
        driver.findElement(By.linkText("Report processors")).click();
        driver.findElement(By.linkText("Universal report")).click();
        driver.findElement(By.linkText("Credit bureau export")).click();



    }

        private void initElements(WebDriver driver) {
    }
}
