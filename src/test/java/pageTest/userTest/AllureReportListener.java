package pageTest.userTest;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ui.drivers.Driver;

public class AllureReportListener implements ITestListener {
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG (WebDriver driver){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    @Override
    public void onStart (ITestContext iTestContext){
        System.out.println("Starting Test Suite ' " + iTestContext.getName() +" '.......");
        iTestContext.setAttribute("WebDriver", Driver.getDriver());
    }
    @Override
    public void onFinish(ITestContext iTestContext){
        System.out.println("Finished Test Suite '" + iTestContext.getName() + '"');
    }
    public void onTestStart(ITestResult iTestResult){
        System.out.println("Starting Test Method '" + getTestMetodName(iTestResult)+ " ' ");
    }
    private  static String getTestMetodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    @Override
    public void onTestFailure(ITestResult iTestResult){
        System.out.println("Test Method ' " + getTestMetodName(iTestResult) + " ' is Failed");
        if (Driver.getDriver() != null){
            System.out.println("Screenshot has captured for the Test Method ' " + getTestMetodName(iTestResult)+ " '");
            saveScreenshotPNG(Driver.getDriver());
        }
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult){
        System.out.println("Test Method ' "+ getTestMetodName(iTestResult)+ " ' is Skipped");
    }
}
