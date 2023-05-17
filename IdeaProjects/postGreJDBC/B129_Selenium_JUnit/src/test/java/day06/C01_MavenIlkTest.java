package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    /*
https://www.amazon.com/ sayfasına gidelim
Arama kutusunu locate edelim
"Samsung headphones" ile arama yapalım
Bulunan sonuç sayısını yazdıralım
İlk ürünü tıklayalım
Sayfadaki tüm başlıkları yazdıralım
 */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com/");

        //  Arama kutusunu locate edelim */
        //driver.findElement(By.id("twotabsearchtextbox")); 1.yol İD ile
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); //xpath ile

       // "Samsung headphones" ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones", Keys.ENTER);

        //Bulunan sonuç sayısını yazdıralım
        WebElement aramaSonucu=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

        System.out.println("Arama Sonucu : "+ aramaSonucu.getText()); //Arama Sonucu : 1-16 of 220 results for "Samsung headphones"

        //İlk ürünü tıklayalım
        WebElement ilkUrun=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        ilkUrun.click();
        /* list alırsak da aağıdaki gibi yapabiliriz*/
        //List<WebElement> ilkUrun=driver.findElements(By.xpath(" //img[@class='s-image'] "));
       // ilkUrun.get(1).click();

//        Sayfadaki tüm başlıkları yazdıralım
        List<WebElement> basliklar = driver.findElements(By.xpath("//h1"));
//        for (WebElement w : basliklar){
//            System.out.println(w.getText());
//        } 1. YOL
            //2.YOL Streamla daha fonksiyonel kod yazılabilir
        basliklar.forEach(t -> System.out.println(t.getText()));

        driver.close();








    }
}
