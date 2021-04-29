/*
Written By: Ethel Atienza
Source link: demoqa.com
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "1. Text Box - Submit and validate the submission.")
    public static void TextboxForm(){
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressElementsTab();
        webForm.presstxtboxTab();
        webForm.enterFirstName();
        webForm.enterEmail();
        webForm.entercurAddress();
        webForm.enterperAddress();
        webForm.pressSubmitbtn();

    }

    @Test(testName = "2.Checkbox - Select the Following Checkboxes")
    public static void Checkbox() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressElementsTab();
        webForm.presschkboxTab();
        webForm.presshome();
        webForm.pressdesktop();
        webForm.selectchkCommands();
        webForm.pressdocument();
        webForm.presscolpsworkspace();
        webForm.selectchkVue();
        webForm.presscolpsOffice();
        webForm.selectchkGeneral();
        webForm.presscolpsDownload();
        webForm.selectchkExcel();
        webForm.Validate2();
    }

    @Test(testName = "3. Web Tables - Update Alden's Last Name, Age, Salary then validate the update.")
    public static void WebTables() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressElementsTab();
        webForm.pressWebTables_tab();
        webForm.pressEdit_btn();
        webForm.pressEdit1_btn();
        webForm.EditLastName();
        webForm.EditSalary();
        webForm.EditAge();
        webForm.pressEditSubmit_btn();
        webForm.Add_btn();
        webForm.Validate3();
    }

    @Test(testName = "4. Links - Validate Response Codes of each link")
    public static void Links() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressElementsTab();
        webForm.pressLink();
        webForm.pressCreated(); webForm.timeout();
        webForm.pressNoContent();webForm.timeout();
        webForm.pressMoved();webForm.timeout();
        webForm.pressBadReq();webForm.timeout();
        webForm.pressUnauthorized();webForm.timeout();
        webForm.pressForbidden();webForm.timeout();
        webForm.pressNotFound();webForm.timeout();
        webForm.pressHome();
        webForm.pressHomeUN();

    }
    @Test(testName = "5. Upload and Download - Upload a file, download the sample file.")
    public static void UploadAndDownload() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressElementsTab();
        webForm.pressUploadandDL();
        webForm.pressDownloadButton();
        webForm.pressUploadButton();

    }

    @Test(testName = "6. Practice Form - Add the following data")
    public static void PracticeForm() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressElementsTab();
        webForm.pressElements();
        webForm.pressForms();
        webForm.pressPracticeFormTab();
        webForm.enterFirstname();
        webForm.enterLastname();
        webForm.enterUserEmail();
        webForm.selectGender();
        webForm.enterMobile();
        webForm.enterdateOfBirthInput();
        webForm.Presssubjects();
        webForm.SelectHobbies();
        webForm.pressuploadPicture();
        webForm.entercurAddress();
        webForm.selectState();
        webForm.selectCity();
        webForm.presssubmittedPractice();
        webForm.Validate6();

    }
    @Test(testName = "7. Browser Windows - Click each button and validate the window that opened")
    public static void AFW() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressafsTab();
        webForm.pressBrowserTab();
        webForm.pressNew_Window();
        webForm.backBrowserWin();
        webForm.pressNewTab();
        webForm.backBrowserWin();
        webForm.pressmessage_WindowButton();
        webForm.backBrowserWin();
    }

    @Test(testName = "8. Date Picker - Select Date 10/21/1991, Date Time October 21, 1991 8:00 AM")
    public static void DatePicker() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressWidgetElement();
        webForm.pressDTPickerTab();
        webForm.selectDate();
        webForm.selectDateandTime();
    }

    @Test(testName = "9. Slider - Move the slider to 90")
    public static void Slider() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressWidgetElement();
        webForm.pressSliderTab();
    }

    @Test(testName = "10. Select Menu - Select the following")
    public static void SelectMenu() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webForm.pressWidgetElement();
        webForm.pressSelectMenuTab();
        webForm.pressselectValue();
        webForm.selectValueAnother();
        webForm.pressselectOne();
        webForm.selectOneOther();
        webForm.pressoldStyle();
        webForm.selectoldStyleViolet();
        webForm.pressmultiSelect();
        webForm.multiSelect();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
    }
}