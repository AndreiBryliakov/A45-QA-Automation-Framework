import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest{

        @Test
        public void deletePlaylist() {
            //GIVEN
            provideEmail("andrei.bryliakov@testpro.io");
            providePassword("te$t$tudent1");
            clickSubmit();
            //WHEN
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#playlists > ul > li:nth-child(3)"))).click();
            //AND
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Delete this playlist']"))).click();
            //AND
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ok"))).click();
            //THEN
            wait.until(ExpectedConditions.textToBe(By.cssSelector("div.success.show"),"Deleted playlist \"HW17.\""));
        }
    }

