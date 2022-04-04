package SeleniumLab.PageObject;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPage {


    public Alert userIdInput;
    public InputMethodTextRun loginPageTitle;
    public Alert userPasswordInput;
    public HTMLInputElement loginButton;

    public class loginPage extends BasePage {

        @FindBy(xpath = "//*[@name='uid']")
        public WebElement userIdInput;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement userPasswordInput;

        @FindBy(xpath = "//input[@name='btnLogin']")
        public WebElement loginButton;

        @FindBy(xpath = "//h2[text()='Guru99 Bank']")
        public WebElement loginPageTitle;

    }
}
