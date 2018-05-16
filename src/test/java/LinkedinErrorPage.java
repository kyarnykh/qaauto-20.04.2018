import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedinErrorPage {
    private WebDriver webDriver;

    private WebElement loginErrorMessage;
    private WebElement passwordErrorMessage;
    private WebElement bannerErrorMessage;

    public LinkedinErrorPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        initElements();
    }

    private void initElements(){
        loginErrorMessage = webDriver.findElement(By.xpath("//*[@id='session_key-login-error']"));
        passwordErrorMessage = webDriver.findElement(By.xpath("//*[@id='session_password-login-error']"));
        bannerErrorMessage = webDriver.findElement(By.xpath("//div[@role='alert']"));

    }

    public boolean isLoginErrorMessageDisplayed(){
        return loginErrorMessage.isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed(){
        return passwordErrorMessage.isDisplayed();
    }

    public String getCurrentLoginError(){
        return loginErrorMessage.getText();
    }

    public String getCurrentLoginErrorPhoneNumber(){
        return loginErrorMessage.getText();
    }

    public String getCurrentLoginErrorOtherLanguage(){
        return loginErrorMessage.getText();
    }

    public String getCurrentPasswordError(){
        return passwordErrorMessage.getText();
    }

    public String getBannerErrorMessage() {
        return bannerErrorMessage.getText();
    }


}