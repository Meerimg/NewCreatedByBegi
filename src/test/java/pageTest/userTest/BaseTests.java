package pageTest.userTest;

import myProject.MyFirstProject;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ui.drivers.Driver;
import ui.helper.ElementActions;
import ui.models.User;
import womenTest.WomenClothes;

@Listeners(AllureReportListener.class)
public abstract class BaseTests {
    public WebDriver driver;
    public ElementActions elementActions;
    public MyFirstProject myFirstProject;
    public WomenClothes womenClothes;
    //public HoodieAndSweatShirt hoodieAndSweatShirt;



    User user = new User();
    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        myFirstProject = new MyFirstProject();
       // hoodieAndSweatShirt = new HoodieAndSweatShirt();
        womenClothes = new WomenClothes();

    }
    @AfterClass
    public void closeDown(){
        Driver.closeDriver();
    }

}