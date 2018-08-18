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
        sendTextOnField(By.cssSelector("#title.form-control.input-md"));

    }

    private void givePhotoGalleryDescription() {
        sendTextOnField(By.id("description"));
    }

    private void browseEnterLeadingPhotoPath() {
        sendTextOnField(By.id("photo_gallery_leading_photo"), "C:\\Users\\Neca\\Desktop\\workspace\\EcoCMS\\src\\upload\\nn.jpg");

    }

    private void confirmSaveLeadingPhoto() {
        clickOnElement(By.id("new_photoGallery_submit"));

    }

    private void addNewPhotoImage() {
        clickOnElement(By.className("glyphicon-plus"));

    }

    private void addNewPhotoImagePath() {
        sendTextOnField(By.id("photo_upload"), "C:\\Users\\Neca\\Desktop\\workspace\\EcoCMS\\src\\upload\\nat-geo-nature.jpg");
    }

    private void addNewPhotoImageTitle() {

        sendTextOnField(By.id("photo_title"));
    }

    private void addNewPhotoImageDescription() {

        sendTextOnField(By.id("photo_description"));
    }

    private void saveNewPhotoImage() {
// By.cssSelector("td[class='someclass'][value='unique text']");
//*[@id="add-photo-dialog"]/div/div/div[2]/button[2]
//#add-photo-dialog > div > div > div.modal-footer > button.btn.btn-success
        clickOnElement(By.xpath("//*[@id=\"add-photo-dialog\"]/div/div/div[2]/button[2]"));
//        clickOnElement(By.cssSelector("button.btn.btn-success"));
    }

    private void backToAllPhotoGall() {
        clickOnElement(By.className("glyphicon-arrow-left"));

    }

    public void insertGalleryWithPhoto() {
        clickOnAddPhotoGalleryButton();
        givePhotoGalleryTitle();
        givePhotoGalleryDescription();
        browseEnterLeadingPhotoPath();
        confirmSaveLeadingPhoto();
        addNewPhotoImage();
        addNewPhotoImagePath();
        addNewPhotoImageTitle();
        addNewPhotoImageDescription();
        saveNewPhotoImage();
        addNewPhotoImage();
        addNewPhotoImagePath();
        addNewPhotoImageTitle();
        addNewPhotoImageDescription();
        saveNewPhotoImage();
        backToAllPhotoGall();

    }
}
