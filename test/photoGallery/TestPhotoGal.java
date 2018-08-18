/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoGallery;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PhotoGalleriesPage;

/**
 *
 * @author Neca
 */
public class TestPhotoGal {

    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static PhotoGalleriesPage photoGalleriesPage;

    public TestPhotoGal() {
    }

    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        photoGalleriesPage = dashboardPage.goToPhotoGalleries();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//    @Test
//    public void hello() throws IOException {
//
//    }
    @Test
    public void testInsertGalleryWithPhoto() {
        photoGalleriesPage.insertGalleryWithPhoto();

    }
}
