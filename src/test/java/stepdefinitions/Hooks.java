package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
   Senaryolar arasındaki baglantıyı saglayan glue yapısına koydugumuz stepdefinition package i içerisinde
 @before ve @after gibi bir notasyon varsa extends testbase demenize gerek kalmadan her senaryodan
 önce veya sonra bu methodlar calisacaktir.
 Cucumber da @before,@after kullanma ihtiyacımız olursa bunu hooks class ına koyarız
     */
    @Before("@gp1")
    public void setUp() {
        System.out.println("Amazonda IPHONE araması yapıldı");
    }

    @Before("@gp2")
    public void setUp2() {
        System.out.println("Amazonda SELENIUM araması yapıldı");
    }

    @Before("@gp3")
    public void setUp3() {
        System.out.println("Amazonda java araması yapıldı");
    }

    @Before("@gp4")
    public void setUp4() {
        System.out.println("Browser kapatıldı");
    }

    @After
    public void tearDown(Scenario scenario) { //Scenario tipinde bir parametre ataması yapılırSystem.out.println("")
   final byte[] screenShoots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
   if (scenario.isFailed()){
       scenario.attach(screenShoots,"image/jpeg","screenshot");
   }
   // final -> bir degikenın degıstırılemez oldugunu belirtir
 //  Byte[] -> bi byte dizisini tanımlar . Byte dizileri i sıralı veri depolama ve işleme
        // işlemleri için kullanılır. verilerin depolanamsı , iletlmesi ve okunması cesitli dosya turleri,
        //  resimler ve diğer

    }


}

