package pages;

import framework.Page;
import org.openqa.selenium.By;

public class PhotoGalleriesPage extends Page {
//    a.btn:nth-child(3)

    private void clickOnAddPhotoGalleryButton() {
        clickOnElement(By.className("glyphicon-plus"));
    }
//   new photo Gal title

    private void givePhotoGalleryTitle() {
//       sendTextOnField(By.cssSelector("a.btn:nth-child(3)"));
        sendTextOnField(By.cssSelector("#title.form-control.input-md"), "NewPhoto");
    }
    
    private void givePhotoDescription() {
        sendTextOnField(By.id("description"));
    }
    
    private void browseForPhoto() {
        clickOnElement(By.id("photo_gallery_leading_photo"));
        
    }
    
    private void enterPhotoPath() {
        sendTextOnField(By.id("photo_gallery_leading_photo"), "http://ecotest.school.cubes.rs/uploads/photo-galleries/4.jpg");
        
    }
    
    private void confirmSavePhoto() {
        clickOnElement(By.id("new_photoGallery_submit"));
        
    }
    
    public void insertGallery() {
        clickOnAddPhotoGalleryButton();
        givePhotoGalleryTitle();
        givePhotoDescription();
        browseForPhoto();
        enterPhotoPath();
        confirmSavePhoto();
    }
}
