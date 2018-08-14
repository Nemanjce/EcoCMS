
package pages;

import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends Page {
     public DashboardPage goToDashboardPage(){
        clickOnElement(By.linkText("admin_dashboard"));
        return PageFactory.initElements(getDriver(), DashboardPage.class);
    }
    public IndexSliderPage goToIndexSlider(){
        clickOnElement(By.linkText("http://ecotest.school.cubes.rs/admin_indexslides"));
        return PageFactory.initElements(getDriver(), IndexSliderPage.class);
    }
    public PhotoGalleriesPage goToPhotoGalleries(){
        clickOnElement(By.xpath("/html/body/div/nav/div[2]/div/ul/li[3]/a/i"));
        return PageFactory.initElements(getDriver(), PhotoGalleriesPage.class);
    }
       public FilemanagerPage goToFilemanager(){
        clickOnElement(By.linkText("http://ecotest.school.cubes.rs/admin_filemanager"));
        return PageFactory.initElements(getDriver(), FilemanagerPage.class);
    }
}
