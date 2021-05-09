package pageObject;

import base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends config {


    public login_page(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.NAME,using = "email")
    public WebElement emailOrID;

   public void enter_emailOrID(){
       emailOrID.sendKeys("osmangani360@gmail.com");
   }
   @FindBy(how = How.NAME, using ="password")
   public WebElement password;

    public void enter_password(){
        password.sendKeys("osman123");
   }

   @FindBy(how = How.CLASS_NAME,using = "my-login")
    public WebElement login_button;

    public void click_login_button(){
        login_button.click();
    }









}
