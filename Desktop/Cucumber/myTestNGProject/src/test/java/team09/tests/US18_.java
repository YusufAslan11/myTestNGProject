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

import static team09.utilities.ReusableMethods.bekle;
import static team09.utilities.ReusableMethods.tumSayfaResmi;

public class US18_ {
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
        bekle(2);

        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(2);

        //Kullanıcı "product" menüsünden ürün ekleme product add bölümüne tıklar
        action.moveToElement(spendinggood.products).perform();
        bekle(1);
        spendinggood.productsAddNew.click();

        //External - Affiliate Product seçilebilmeli
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(1);
        Select select = new Select(spendinggood.ddm);
        select.selectByVisibleText("External/Affiliate Product");

       // URL, Button Text, Price, Sale Price yazılabilmeli

        spendinggood.URL_External.sendKeys(ConfigReader.getProperty("Lenovo_Url"));
        spendinggood.buttonText.sendKeys("LENOVO COMPUTER");
        spendinggood.price.sendKeys("2000$");
        spendinggood.salePrice.sendKeys("1750$");

        boolean isDisplayed=spendinggood.URL_External.isDisplayed()&&spendinggood.buttonText.isDisplayed()&&spendinggood.price.isDisplayed()&&
                spendinggood.salePrice.isDisplayed();
        Assert.assertTrue(isDisplayed);
        String filePath="target/TestOutput";





    }}
