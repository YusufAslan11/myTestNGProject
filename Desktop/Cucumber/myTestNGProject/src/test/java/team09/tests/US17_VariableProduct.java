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
import team09.utilities.ReusableMethods;

import static team09.utilities.ReusableMethods.bekle;


public class US17_VariableProduct {
    WebDriver driver;

    @Test
    public void test01() { //Kullanıcı register alanını tıklar

        //Kullanıcı  https://spendinggood.com/ sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("Spendinggood_Url"));
        bekle(1);

       //Kullanıcı sign in butonun tıklar
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

        //Variable product bölümü seçilebilmelidir
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(1);
        Select select = new Select(spendinggood.ddm);
        select.selectByVisibleText("Variable Product");

        //Variable product bölümü seçildiği görülebilmelidir
        Assert.assertTrue(spendinggood.variableProduct.isDisplayed());

//----------------------------------------------------------------------------------//

        //Product Title girilir
        spendinggood.productTitle.sendKeys("LAPTOP");
        bekle(1);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(1);

        //Kısa Tanım girilir
        Driver.getDriver().switchTo().frame(spendinggood.iframeShort);//Iframe e giriş
        spendinggood.shortSpace.click();
        spendinggood.shortSpace.sendKeys("Lenovo");
        bekle(1);
        Driver.getDriver().switchTo().parentFrame(); // Iframeden çıkış
        bekle(1);
//

        //Uzun Tanım Girilir
        Driver.getDriver().switchTo().frame(spendinggood.iframeLong);//Iframe e giriş
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        bekle(1);
        spendinggood.longSpace.click();
        spendinggood.longSpace.sendKeys("Lenovo Computers Features");
        bekle(1);
        Driver.getDriver().switchTo().parentFrame();
        bekle(1);
        action.sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
        bekle(3);

    //Product Title, Short Description ve Description yazılabildiği görülür

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

//        Kullanici Categories menusunden secim yapar

        action.sendKeys(Keys.PAGE_DOWN).perform();


        spendinggood.addNewCategories.click();
        bekle(2);

        spendinggood.textSendNewCategorie.sendKeys("Home Furniture123456");
        ReusableMethods.bekle(4);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);

        ReusableMethods.click(spendinggood.categoriesAdd);
        action.sendKeys(Keys.PAGE_DOWN);
        bekle(1);
        ReusableMethods.click(spendinggood.brandAdd);
        try {
            driver.switchTo().alert().accept();
        }catch(Exception e){
            System.out.println("Alert");

        }
bekle(2);
        spendinggood.writeBrandText.sendKeys("NEW Furtinure1");
        bekle(2);
        ReusableMethods.click(spendinggood.brandAdd2);






















//        //Ürün fotoğrafı eklenir  (Javascript execute--action)
//        bekle(3);
//        spendinggood.imageAdd.click();
//        String imagePath = "C:/Users/ttyus/Desktop/PROJE/laptopx.jpeg";


//              public static void uploadFilePath(String imagePath){
//            try{
//                ReusableMethods.waitFor(3);
//                StringSelection stringSelection = new StringSelection(filePath);
//                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
//                Robot robot = new Robot();
//                //pressing ctrl+v
//                robot.keyPress(KeyEvent.VK_CONTROL);
//                ReusableMethods.waitFor(3);
//                robot.keyPress(KeyEvent.VK_V);
//                ReusableMethods.waitFor(3);
//                //releasing ctrl+v
//                robot.keyRelease(KeyEvent.VK_CONTROL);
//                ReusableMethods.waitFor(3);
//                robot.keyRelease(KeyEvent.VK_V);
//                ReusableMethods.waitFor(3);
//                System.out.println("PASSED");
//                //pressing enter
//                ReusableMethods.waitFor(3);
//                robot.keyPress(KeyEvent.VK_ENTER);
//                ReusableMethods.waitFor(3);
//                //releasing enter
//                robot.keyRelease(KeyEvent.VK_ENTER);
//                ReusableMethods.waitFor(3);
//                System.out.println("ENTER");
//            }catch (Exception e){
//            }
        }//resim

    //Categories seçilebilmeli






}
