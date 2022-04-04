package SeleniumLab.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage {


    public HTMLInputElement newCustomerButton;

    public class homePage extends BasePage{

        @FindBy(xpath = "//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]")
        public WebElement homePageMessage;

        @FindBy(xpath = "//a[contains(text(),\"New Customer\")]")
        public WebElement newCustomerButton;
    }
}
