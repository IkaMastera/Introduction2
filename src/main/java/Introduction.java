import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction{
    public static void main(String[] args) {
        //Invoking Browser
        //System.setProperty("webdriver.chrome.driver", "D:/Programming/Chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        driver.getCurrentUrl();
    }
}
