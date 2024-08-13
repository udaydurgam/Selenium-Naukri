import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Naukri {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\udayd\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open Naukri.com registration page
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

        // Initialize Page Object
        registrationPage = new RegistrationPage(driver);
    }

    public void testRegistration() {
        registrationPage.enterFullName("Uday Durgam");
        registrationPage.enterEmail("subhadradurgam2018@gmail.com");
        registrationPage.enterPassword("Uday@123");
        registrationPage.enterMobile("8698045435");
        registrationPage.uploadResume("C:\\Users\\udayd\\OneDrive\\Documents\\UDAY DURGAM.pdf");
        registrationPage.clickSubmitButton();
    }

}
