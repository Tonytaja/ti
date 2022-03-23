package mouseAutomation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static framework.DriverProvider.prepareDriver;

public class MouseHover {


//  //span[contains(text(),'Historia przeglądania')]
        @FindBy(xpath = "//*[@id='nav-link-accountList']")
        private WebElement clients;
        @FindBy(xpath = "//div[contains(text(),'Zobacz pełny widok')]")
        private WebElement it;





//        public MouseHover(){
//            PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(),10),this);
//        }

        public void mouseHov()  {
            prepareDriver().get("https://www.amazon.pl/");
            Actions actionProvider = new Actions(prepareDriver());
            actionProvider.moveToElement(clients).build().perform();
        }

//           Thread.sleep(20000);
//            it.click();
//           Thread.sleep(20000);
//            System.out.println(prepareDriver().getCurrentUrl());



}
