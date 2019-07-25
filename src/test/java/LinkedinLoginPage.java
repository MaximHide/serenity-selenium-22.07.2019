import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LinkedinLoginPage extends LinkedinLoginTest {



    public String getTitle(WebDriver driver){

                return driver.getTitle();
    }

    public void enterLinkedin(WebDriver driver ,String login, String pswrd) {

        driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(pswrd);
        driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();

    }



}
