import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization1 {

    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();

    private By imputUserName = By.xpath("//*[@id=login]/div[1]/label/input");
    private By imputPassword = By.xpath("//*[@id=login]/div[2]/label/input");
    private By btnLogin = By.xpath("//*[@id=login]/div[3]/button/span");
    private By getErrorText = By.xpath("//*[@id=app]/main/div/div/div[2]/p[1]");



//    @Test
//    public void negAuthorization1() {
//        driver.get(getDate.getUrl);
//        driver.manage().window().maximize();
//        driver.findElement(imputUserName).sendKeys(getDate.userName);
////        click();
//        driver.findElement(imputPassword).sendKeys(getDate.password);
////        sendKeys(getDate.password);
//        driver.findElement(btnLogin).click();
//        String getError = driver.findElement(getErrorText).getText();
//        Assert.assertEquals("Invalid credentials.", getError);
//    }

    @Test
    public void authorization1() {
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=login]/div[1]/label/div")).click();
        driver.findElement(By.xpath("//*[@id=login]/div[2]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=login]/div[3]/button/span")).click();

    }









}
