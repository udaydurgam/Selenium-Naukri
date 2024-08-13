import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By fullNameLocator = By.id("name");
    private By emailLocator = By.id("email");
    private By passwordLocator = By.id("password");
    private By mobileLocator = By.id("mobile");
    private By submitButtonLocator = By.className("main-2");
    private By uploadResumeLocator = By.id("resumeUpload");

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    // Actions
    public void enterFullName(String name) {
        WebElement fullNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(fullNameLocator));
        fullNameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        passwordField.sendKeys(password);
    }

    public void enterMobile(String mobile) {
        WebElement mobileField = wait.until(ExpectedConditions.visibilityOfElementLocated(mobileLocator));
        mobileField.sendKeys(mobile);
    }

    public void uploadResume(String filePath) {
        WebElement uploadResumeField = wait.until(ExpectedConditions.visibilityOfElementLocated(uploadResumeLocator));
        uploadResumeField.sendKeys(filePath);
    }

    public void clickSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(submitButtonLocator));
        submitButton.click();
    }
}
