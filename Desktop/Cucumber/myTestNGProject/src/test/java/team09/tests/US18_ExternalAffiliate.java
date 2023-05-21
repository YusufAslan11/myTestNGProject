package team09.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team09.page.Spendinggood;
import team09.utilities.ConfigReader;
import team09.utilities.Driver;
import team09.utilities.ReusableMethods;

import static team09.utilities.ReusableMethods.bekle;

public class US18_ExternalAffiliate {
    WebDriver driver;

    @Test
    public void test01() {

        //Kullanıcı  https://spendinggood.com/ sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("Spendinggood_Url"));
        bekle(1);

        //Kullanıcı sign in e tıklar
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

        //External - Affiliate product bölümü seçildiği görülebilmelidir
        Assert.assertTrue(spendinggood.externalAffiliateProduct.isDisplayed());

        // URL, Button Text, Price, Sale Price yazılabilmeli
        spendinggood.URL_External.sendKeys(ConfigReader.getProperty("Lenovo_Url"));
        spendinggood.buttonText.sendKeys("LENOVO COMPUTER");
        spendinggood.price.sendKeys("2000$");
        spendinggood.salePrice.sendKeys("1750$");

        boolean isDisplayed=spendinggood.URL_External.isDisplayed()&&spendinggood.buttonText.isDisplayed()&&spendinggood.price.isDisplayed()&&
                spendinggood.salePrice.isDisplayed();
        Assert.assertTrue(isDisplayed);
        String filePath="target/TestOutput";

        //Kısa Tanım girilir
        Driver.getDriver().switchTo().frame(spendinggood.iframeShort);//Iframe e giriş
        spendinggood.shortSpace.click();
        spendinggood.shortSpace.sendKeys("Lenovo");
        bekle(1);
        Driver.getDriver().switchTo().parentFrame(); // Iframeden çıkış
        bekle(1);

        // Resim eklenir

        ReusableMethods.click(spendinggood.imageAdd17);
        bekle(2);

        ReusableMethods.click(spendinggood.selectFile17);
        bekle(2);
        String imagePath = "C:\\Users\\ttyus\\Desktop\\PROJE\\laptopx.jpeg";
        ReusableMethods.uploadFilePath(imagePath);
        bekle(2);
        action.sendKeys(Keys.ENTER);
        bekle(1);
        ReusableMethods.click(spendinggood.lastSelectImg17);

        // Kullanici Categories menusunden secim yapar

        action.sendKeys(Keys.PAGE_DOWN).perform();
        spendinggood.addNewCategories.click();
        bekle(2);

        //Kullanıcı yeni product brand eklenebilmeli
        Faker faker=new Faker();
        String newBrand= faker.funnyName().name();
        spendinggood.textSendNewCategorie.sendKeys(newBrand);
        ReusableMethods.bekle(4);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
        ReusableMethods.click(spendinggood.categoriesAdd);

        action.sendKeys(Keys.PAGE_DOWN);
        bekle(1);
        ReusableMethods.click(spendinggood.brandAdd);
        bekle(2);
        String brand2=faker.funnyName().name();
        spendinggood.writeBrandText.sendKeys(brand2);
        bekle(1);

        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
        bekle(2);
        ReusableMethods.click(spendinggood.brandAdd2);

        //Kullanıcı Tags ekler
        String tags=faker.funnyName().name();
        spendinggood.textTag.sendKeys(tags,Keys.TAB);


        //Kullanıcı Catalog Visibility seçeneklerini seçer

        Select select1=new Select(spendinggood.catalogVisibilityDdm);
        select1.selectByVisibleText("Shop only");
        bekle(1);


    }}
