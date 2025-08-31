package PagesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LoginPage extends BaseClass
{
    @FindBy(xpath="//input[@name=\"username\"]") private WebElement username;
    @FindBy(xpath="//input[@name='password']") private WebElement password;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") 
    private WebElement submit;
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']") private WebElement userDD;
    @FindBy(xpath = "//a[text()=\"Logout\"]") private WebElement logout; 

    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void loginToHRMS()
    {
		
		username.sendKeys("Admin");
		
		password.sendKeys("admin123");
		
		//By.xpath("//button[normalize-space()='Login']")
		submit.click();
    }

    public void logoutfromHRMS() throws Exception
    {
        Thread.sleep(2000);
        userDD.click();
        Thread.sleep(2000);
        logout.click();

    }
}
