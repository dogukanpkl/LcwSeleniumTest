

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;


public class Scenarios extends Methods {
    public Scenarios(WebDriver driver) {
        super(driver);
    }



    public void LcWaikikiTest(){
        boolean girisKontrol=false;
        isDisplayed(By.xpath("//a[@class='dropdown-toggle']//*[contains(text(), 'Giriş Yap')]"),girisKontrol);
        clickElement(By.xpath("//a[@class='dropdown-toggle']//*[contains(text(), 'Giriş Yap')]"));
        sendKeys(By.id("LoginEmail"),"turtlee.0611@gmail.com");
        sendKeys(By.id("Password"),"asdasd123");
        clickElement(By.id("loginLink"));
        boolean hesapKontrol=false;
        isDisplayed(By.xpath("//*[contains(text(), 'Hesabım')]"),hesapKontrol);
        clickElement(By.id("search_input"));
        sendKeys(By.id("search_input"),"Pantolon");
        clickEnter(By.id("search_input"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //clickEnter(By.xpath("//*[contains(text(), 'Daha Fazla Ürün Gör')]"));

        randomSelect(By.className("a_model_item"));
        clickElement(By.id("pd_add_to_cart"));



    }


}