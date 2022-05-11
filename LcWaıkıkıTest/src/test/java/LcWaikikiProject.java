import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class LcWaikikiProject {

    private Object Keys;

    @Test
    public void LcWaikikiLogin(){

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Doğukan/IdeaProjects/LcWaıkıkıTest/src/test/java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");

        WebElement girisYap=driver.findElement(By.xpath("//a[@class='dropdown-toggle']//*[contains(text(), 'Giriş Yap')]"));
        boolean girisKontrol=false;
        girisKontrol=girisYap.isDisplayed();
        if (girisKontrol==true){
            System.out.println("Siteye başarıyla giriş yapılmıştır.");
        }
        else{
            System.out.println("Siteye giris yapılamamıştır.");
        }
        girisYap.click();


        driver.findElement(By.id("LoginEmail")).sendKeys("asdasd@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("asdasd123");
        driver.findElement(By.id("loginLink")).click();
        WebElement hesabim=driver.findElement(By.xpath("//*[contains(text(), 'Hesabım')]"));
        boolean hesap=false;
        hesap=hesabim.isDisplayed();
        if (hesap==true){
            System.out.println("Başarılı bir şekilde kullanıcı girişi yapılmıtır.");
        }
        else{
            System.out.println("Kullanıcı girişi başarısız.");
        }
        driver.findElement(By.id("search_input")).click();
        driver.findElement(By.id("search_input")).sendKeys("Pantolon");
        driver.findElement(By.id("search_input")).sendKeys(org.openqa.selenium.Keys.ENTER);


       // JavascriptExecutor javascript = (JavascriptExecutor) driver;
      //  javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)");

       // driver.findElement(By.xpath("//*[contains(text(), 'Daha Fazla Ürün Gör')]")).sendKeys(org.openqa.selenium.Keys.ENTER);



        List<WebElement> allProducts = driver.findElements(By.className("a_model_item"));
        System.out.println(allProducts.size());
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        System.out.println("rastgele ürün ıd = "+randomProduct);
        }















}
