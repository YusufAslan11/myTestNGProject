package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example {
        /*
//   https://www.amazon.com/ sayfasına gidin.
//   “city bike” araması yapın
//   Arama sonuç metnini yazdırın
//   Sonuç sayısını yazdırın
//   Sonuc sayısını LAMBDA ile yazdırın
//   Çıkan ilk sonucun resmine tıklayın.
//   Sayfayı kapatın
*/
        public static void main(String[] args) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

                //   https://www.amazon.com/ sayfasına gidin.
                driver.get("https://www.amazon.com/ ");

                //   “city bike” araması yapın
                WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

                aramaKutusu.sendKeys("city bike", Keys.ENTER);

                //   Arama sonuç metnini yazdırın

                WebElement sonuc=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
                System.out.println(sonuc.getText());

                WebElement sayi=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
                String sayi1=sayi.getText().split(" ")[2];
                System.out.println("Sayı: "+ sayi1);

                //   Sonuc sayısını LAMBDA ile yazdırın

                //   Çıkan ilk sonucun resmine tıklayın.

                driver.findElement(By.xpath("//img[@class='s-image']")).click();

                driver.close();


        }

}
