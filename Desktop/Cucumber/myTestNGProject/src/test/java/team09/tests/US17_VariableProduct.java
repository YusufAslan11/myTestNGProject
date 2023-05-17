package team09.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team09.page.Spendinggood;
import team09.utilities.ConfigReader;
import team09.utilities.Driver;

import static team09.utilities.ReusableMethods.*;

public class US17_VariableProduct {
    WebDriver driver;
    @Test
    public void test01() {

        //Kullanıcı  https://spendinggood.com/ sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("Spendinggood_Url"));
        bekle(1);

        //Kullanıcı register alanını tıklar
        Spendinggood spendinggood = new Spendinggood();
        spendinggood.signIn.click();
        bekle(1);

        //Kullanıcı Username girer
        spendinggood.username.sendKeys(ConfigReader.getProperty("mail17"));
        bekle(1);

        //Kullanıcı Pasword  girer
        spendinggood.password17.sendKeys(ConfigReader.getProperty("pass17"));
        bekle(1);

        //Kullanıcı Sign In butonuna basarak giriş yapar
        spendinggood.signInButton.click();
        bekle(3);

        //Kullanıcı My Account linkine tıklar
        spendinggood.myAccount.click();
        bekle(1);

        //Kullanıcı Store Manager sekmesine tıklar
        spendinggood.storeManager.click();
        bekle(3);

        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(3);

        //Kullanıcı "product" menüsünden ürün ekleme product add bölümüne tıklar
        action.moveToElement(spendinggood.products).perform();
        bekle(1);
        spendinggood.productsAddNew.click();

        //Variable product bölümü seçilebilmelidir
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(3);
        Select select = new Select(spendinggood.ddm);
        select.selectByVisibleText("Variable Product");

        //Variable product bölümü seçildiği görülebilmelidir
        Assert.assertTrue(spendinggood.variableProduct.isDisplayed());


    }


}
