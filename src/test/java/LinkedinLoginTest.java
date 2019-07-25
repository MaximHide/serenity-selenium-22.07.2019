import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.support.PageFactory;

@RunWith(SerenityRunner.class)
public class LinkedinLoginTest extends BaseTest{


    public LinkedinLoginTest() {
        PageFactory.initElements(driver, this);
    }




    @Test
    public void successLoginTest() throws Exception {
        LinkedinLoginPage linkedinLoginPage  = new LinkedinLoginPage();

        driver.get("https://www.linkedin.com/");

        Assert.assertEquals("LinkedIn: Log In or Sign Up",linkedinLoginPage.getTitle(driver));

        linkedinLoginPage.enterLinkedin(driver,"a","b");

    }
}
