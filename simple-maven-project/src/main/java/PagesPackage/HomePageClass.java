package PagesPackage;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class HomePageClass extends BaseClass {

@FindBy(xpath = "//span[text()='Admin']") private WebElement adminOption;

public HomePageClass(){
    PageFactory.initElements(driver, this);
}

public String verifyHomeTitle(){
    return driver.getTitle();
}

public void clickOnAdminOption(){
    adminOption.click();
}


}
