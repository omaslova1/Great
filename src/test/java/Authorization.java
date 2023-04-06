import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Authorization extends Data {

    private By imputUserName = By.xpath("//*[@id=login]/div[1]/label/input");
    private By imputPassword = By.xpath("//*[@id=login]/div[2]/label/input");
    private By btnLogin = By.xpath("//*[@id=login]/div[3]/button/span");


    @Test
    public void authorization() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(imputUserName).sendKeys(getDate.userName);
        driver.findElement(imputPassword).sendKeys(getDate.password);
        driver.findElement(btnLogin).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.quit();




    }



}
