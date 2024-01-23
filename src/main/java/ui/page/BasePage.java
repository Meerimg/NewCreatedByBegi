package ui.page;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;
import ui.drivers.Driver;
import ui.helper.ElementActions;

public abstract class BasePage {
    Faker faker = new Faker ();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public ElementActions elementActions = new ElementActions();
}
