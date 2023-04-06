import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Authorization2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://test-stand.gb.ru/login");


        driver.findElement(By.xpath("//*[@id=login]/div[1]/label/input")).sendKeys("active");

        WebElement passwordInputField = driver.findElement(By.xpath("//*[@id=login]/div[2]/label/input"));
        passwordInputField.click();
        passwordInputField.sendKeys("c76a5e84e4");

        driver.findElement(By.xpath("//*[@id=login]/div[3]/button/span")).click();

    }


}
