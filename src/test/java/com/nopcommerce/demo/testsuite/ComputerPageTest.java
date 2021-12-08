package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    ComputerPage computerpage;

    @BeforeMethod
    public void inIt() {
        computerpage = new ComputerPage();
    }

    @Test
    public void VerifyUserShouldNavigateToComputerPageSuccessfully() {

        computerpage.clickOnComputerLink();
        computerpage.verifycomputerpagetitle("Computers");
        computerpage.selectDesktopOption();

    }
    @Test(groups = {"sanity","Regression"})
    public  void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computerpage.clickOnComputerLink();
        computerpage.selectDesktopOption();
        computerpage.verifydesktoppagetitle("Desktops");
    }
    @Test(dataProvider = "computerConfig",dataProviderClass = TestData.class,groups = {"smoke","Regression"})
    public void VerifyThatUserShouldBuildYourOWnComputerAndAddTemToCartSuccessfully(String processor,String ram,String hdd,String os,String software){

        computerpage.clickOnComputerLink();
        computerpage.selectDesktopOption();
        computerpage.clickOnBuildYourOwnComputer();

    }
}
