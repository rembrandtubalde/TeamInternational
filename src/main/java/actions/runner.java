package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class runner {
    public void Program(){
        try {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.teaminternational.com/");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            for (int i = 1; i <= 7; i++) {
                WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/section["+i+"]"));
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(100 * 10);
            }
            WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(100 * 10);
            for (int i = 1; i <= 9; i++) {
                Actions action = new Actions(driver);
                WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div["+i+"]"));
                action.moveToElement(link).build().perform();
                Thread.sleep(100 * 10);
            }
            for (int i = 1; i <= 9; i++) {
                WebElement sec = driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div["+i+"]"));
                sec.click();
                Thread.sleep(200 * 10);
                driver.navigate().back();
                Thread.sleep(200 * 10);
            }
                WebElement element1 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]"));
                js.executeScript("arguments[0].scrollIntoView(true);", element1);
                Thread.sleep(100 * 10);
            for (int i = 1; i <= 7; i++) {
                Actions action = new Actions(driver);
                WebElement link1 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]/div/div/div[2]/div/div/div["+i+"]"));
                action.moveToElement(link1).build().perform();
                Thread.sleep(100 * 10);
            }
            for (int i = 1; i <= 7; i++) {
                WebElement element2 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]"));
                js.executeScript("arguments[0].scrollIntoView(true);", element2);
                Thread.sleep(100 * 10);
                WebElement sec1 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]/div/div/div[2]/div/div/div["+i+"]"));
                sec1.click();
                Thread.sleep(200 * 10);
                driver.navigate().back();
                Thread.sleep(200 * 10);
            }

            WebElement element2 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[3]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element2);
            Thread.sleep(100 * 10);
            for (int i = 1; i <= 25; i++) {
                Actions action = new Actions(driver);
                WebElement link2 = driver.findElement(By.xpath("//*[@id=\"logo-partners-"+i+"\"]"));
                action.moveToElement(link2).build().perform();
                Thread.sleep(100 * 10);
            }

            WebElement element3 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[4]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element3);
            Thread.sleep(100 * 10);
            for (int i = 1; i <= 7; i++) {
                WebElement sec2 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[4]/div/div/div[2]/div/div[3]/img[2]"));
                sec2.click();
                Thread.sleep(100 * 10);
            }
           // for (int i = 1; i <= 7; i++) {
                WebElement element4 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[4]"));
                js.executeScript("arguments[0].scrollIntoView(true);", element4);
                Thread.sleep(100 * 10);
                WebElement sec3 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[4]/div/div/div[2]/div/div[3]/div/div/div[3]/div[2]/a"));
                sec3.click();
                Thread.sleep(200 * 10);
                driver.navigate().back();
                Thread.sleep(200 * 10);
            //}
            WebElement element5 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[5]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element5);
            Thread.sleep(100 * 10);

            WebElement element6 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[6]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element6);
            Thread.sleep(100 * 10);
            //driver.close();
            WebElement element7 = driver.findElement(By.xpath("//*[@id=\"content\"]/section[7]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element7);
            Thread.sleep(100 * 10);
            driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"contact-section\"]/iframe")));
            String array[] = {"jose","perez","Team","joseperez@gmail.com","987654321","hello"};
            for (int i = 1; i <= 6; i++) {
                WebElement clicdato = driver.findElement(By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item["+i+"]/slot/div/span/input"));
                clicdato.click();
                WebElement dato = driver.findElement(By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item["+i+"]/slot/div/span/input"));
                dato.sendKeys(array[i-1]);
            }
            WebElement check1 = driver.findElement(By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[7]/slot/lightning-layout/slot/lightning-layout-item[1]/slot/label/span"));
            check1.click();
            WebElement check2 = driver.findElement(By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[8]/slot/lightning-layout/slot/lightning-layout-item[1]/slot/label/span"));
            check2.click();
            WebElement btn = driver.findElement(By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[9]/slot/div/input"));
            btn.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
