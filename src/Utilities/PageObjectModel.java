package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageObjectModel {

    public PageObjectModel(){
        PageFactory.initElements(ParameterDriver.driver,this);
    }

    @FindBy (css = "input[placeholder='Search']")
    public WebElement searchInbox;

    @FindBy (xpath = "//td[@class='text-left']//a")
    public List<WebElement> productNamesOnWishList;


}
