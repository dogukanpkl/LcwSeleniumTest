import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver driver;
    WebDriverWait wait;

    public Methods(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

            public void untilElementClicable(By by) {
                //tıklanabilir olması beklenir.
                wait.until(ExpectedConditions.elementToBeClickable(by));

            }

            public void untilElementDisplayed(By by) {
                //Görünür olması beklenir
                wait.until(ExpectedConditions.visibilityOfElementLocated(by));

            }

            public void untilElementAppear(By by) {
                //sayfanın yüklenmesini bekler
                wait.until(ExpectedConditions.presenceOfElementLocated(by));

            }

    public WebElement findElement(By by) {

        untilElementAppear(by);
        return driver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }




    public void clickElement(By by) {

        untilElementDisplayed(by);
        untilElementClicable(by);

        findElement(by).click();
    }



    public void clickEnter(By by) {
        findElement(by).sendKeys(Keys.ENTER);
    }

    public void isDisplayed(By by,boolean disp) {
        disp=findElement(by).isDisplayed();
        if (disp == true) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Giriş başarısız");
        }

    }
    public void randomSelect(By by){
        untilElementAppear(by);
        List<WebElement> allProducts = driver.findElements(by);
        System.out.println(allProducts.size());
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        System.out.println("rastgele ürün ıd = "+randomProduct);
    }

}