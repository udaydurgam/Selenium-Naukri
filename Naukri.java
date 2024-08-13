import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class Naukri {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\udayd\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.naukri.com/registration/createAccount");

        // Add a wait to ensure page is fully loaded
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        RegistrationPage regPage = new RegistrationPage(driver);

        // Perform actions
        try {
            regPage.enterName("Uday Durgam");
            regPage.enterEmail("subhadradurgam2019@gmail.com");
            regPage.enterPassword("Uday@123");
            regPage.enterMobile("8698045435");
            regPage.setWorkStatus("Fresher"); // Change to "Experienced" if needed
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

    }
}
