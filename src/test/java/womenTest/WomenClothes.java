package womenTest;

import myProject.MyFirstProject;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageTest.userTest.BaseTests;
import ui.drivers.Driver;

import javax.swing.*;

public class WomenClothes extends BaseTests {
    @Test (description = "Women")
    void newClothesPages() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        MyFirstProject womenClothes = new MyFirstProject();
        womenClothes.womenBtn.click();
        womenClothes.hoodieAndSweatShirt.click();
        Thread.sleep(3000);


    }
}
