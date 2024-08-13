
public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    // Web Elements
    By nameField = By.id("name");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By mobileField = By.id("mobile");
    By workStatusDropdown = By.id("labelClass");

    // Actions
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void setWorkStatus(String workStatus) {
        try {
            // Wait for the dropdown to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(workStatusDropdown));
            WebElement dropdown = driver.findElement(workStatusDropdown);
            Select select = new Select(dropdown);

            // Select the appropriate option
            if (workStatus.equalsIgnoreCase("Fresher")) {
                select.selectByVisibleText("Fresher");
            } else if (workStatus.equalsIgnoreCase("Experienced")) {
                select.selectByVisibleText("Experienced");
            } else {
                throw new IllegalArgumentException("Invalid work status: " + workStatus);
            }
        } catch (Exception e) {
            System.out.println("Failed to set work status: " + e.getMessage());
        }
    }
}
