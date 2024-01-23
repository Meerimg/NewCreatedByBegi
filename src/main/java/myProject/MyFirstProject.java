package myProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.page.BasePage;

public class MyFirstProject extends BasePage {
    @FindBy(xpath = "(//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all'])[1]")
    public WebElement womenBtn;

    @FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html'])[1]")
    public WebElement hoodieAndSweatShirt;


    public MyFirstProject clickWomenBtn(){
        elementActions.scrollToElement(womenBtn);
        elementActions.clickTheButton(womenBtn);
        return this;
    }
    public MyFirstProject clickHoodieAndSweatShirt() {
        elementActions.scrollToElement(hoodieAndSweatShirt);
        elementActions.clickTheButton(hoodieAndSweatShirt);
        return this;
    }

}
