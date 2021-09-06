package Docker;
import org.openqa.selenium.*;
import org.testng.IExecutionListener;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
 
public class TestNG_ToDoGroup extends Helper implements IExecutionListener {
    public static String status = "passed";
 
    @Override
    public void onExecutionStart()
    {
        System.out.println("onExecutionStart");
    }
 
    @Test(priority = 1, groups = {"ToDo"})
    @Parameters({"environment"})
    public void test_Selenium4_ToDoApp_Test1(String environment) throws InterruptedException, MalformedURLException
    {
        if (environment.equalsIgnoreCase("local"))
        {
            setupThread("Firefox");
        }
        WebDriver webdriver = getDriver();
        webdriver.navigate().to("https://lambdatest.github.io/sample-todo-app/");
        webdriver.manage().window().maximize();
        System.out.println("Started session");
        Thread.sleep(5000);
 
        try
        {
            /* Let's mark done first two items in the list. */
            webdriver.findElement(By.name("li1")).click();
            webdriver.findElement(By.name("li2")).click();
 
            /* Let's add an item in the list. */
            webdriver.findElement(By.id("sampletodotext")).sendKeys("Happy Testing at LambdaTest");
            webdriver.findElement(By.id("addbutton")).click();
 
            /* Let's check that the item we added is added in the list. */
            String enteredText = webdriver.findElement(By.xpath("/html/body/div/div/div/ul/li[6]/span")).getText();
            if (enteredText.equals("Happy Testing at LambdaTest")) {
                System.out.println("Demonstration is complete");
                status = "passed";
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        if (getDriver() != null)
        {
            tearDownDriver();
        }
    }
 
    @Test(priority = 2, groups = {"ToDo"})
    @Parameters({"environment"})
    public void test_Selenium4_ToDoApp_Test2(String environment) throws InterruptedException, MalformedURLException {
        if (environment.equalsIgnoreCase("local"))
        {
            setupThread("Firefox");
        }
        WebDriver webdriver = getDriver();
        webdriver.navigate().to("https://lambdatest.github.io/sample-todo-app/");
        webdriver.manage().window().maximize();
        System.out.println("Started session");
        Thread.sleep(5000);
 
        try
        {
            /* Let's mark done first three items in the list. */
            webdriver.findElement(By.name("li1")).click();
            webdriver.findElement(By.name("li2")).click();
            webdriver.findElement(By.name("li3")).click();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        status = "passed";
        if (getDriver() != null)
        {
            tearDownDriver();
        }
    }
 
    @Override
    public void onExecutionFinish()
    {
        System.out.println("onExecutionFinish");
    }
}
