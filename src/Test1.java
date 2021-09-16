import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rea\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://oglasi.osijek031.com/");

        WebElement rss = driver.findElement(By.xpath("//*[@id=\"footer\"]/tbody/tr/td/a[4]"));

        rss.click();

        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);

        String ExpectedTitle = "Bijelo-Plavi oglasnik - besplatni mali oglasi Osijek";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

}