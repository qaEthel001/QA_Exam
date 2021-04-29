/*
Written By: Ethel Atienza
Source link: demoqa.com
*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.println;

public class WebForm extends PageObject{
    private final String USER_NAME = "QAETHEL001";
    private final String USER_EMAIL = "QAETHEL001@gmail.com";
    private final String CURRENT_ADDRESS = "Boni Mandaluyong City";
    private final String PERMANENT_ADDRESS = "Calapan City Oriental Mindoro";
    private final String EDIT_LASTNAME = "Testing";
    private final String EDIT_AGE = "49";
    private final String EDIT_SALARY = "1000000000";
    private final String EMPTY = "";

    ///Textbox find element
    @FindBy(css=".card:nth-child(1) svg")
    private WebElement elements_tab;
    @FindBy(id="item-0")
    private WebElement textbox_tab;
    @FindBy(id = "userName")
    private WebElement user_name;
    @FindBy(id = "userEmail")
    private WebElement user_email;
    @FindBy(id = "currentAddress")
    private WebElement current_address;
    @FindBy(id = "permanentAddress")
    private WebElement permanent_address;
    @FindBy(id = "submit")
    private WebElement btn_submit;
    @FindBy(xpath = "//div[@id='output']/div")
    private WebElement submittedText;

    ///End Textbox find element

    ///Textbox action
    public WebForm(WebDriver driver) {
        super(driver);
    }
    public void pressElementsTab(){
        this.elements_tab.click();
    }
    public void presstxtboxTab(){
        this.textbox_tab.click();
    }
    public void enterFirstName(){ this.user_name.sendKeys(USER_NAME); }
    public void enterEmail(){
        this.user_email.sendKeys(USER_EMAIL);
    }
    public void entercurAddress(){
        this.current_address.sendKeys(CURRENT_ADDRESS);
    }
    public void enterperAddress(){
        this.permanent_address.sendKeys(PERMANENT_ADDRESS);
    }
    public void pressSubmitbtn(){
        System.out.println("1. Text Box - Submit and validate the submission.");
        System.out.println("1.1 User were able to enter data the followinf fields");
        this.btn_submit.click();
        if (user_name.equals(EMPTY) && user_email.equals(EMPTY)&& current_address.equals(EMPTY)&& permanent_address.equals(EMPTY))
        {
            System.out.println("Incomplete data");
        }
        else {
        ///    System.out.println("1.2 The following data has been successfully submitted:"+"\n Username: "+ user_name.getText()+"\n Email: " +user_email.getText() +"\n Current Address: "+ current_address.getText()+"\n Permanent Address: " + permanent_address.getText() );
            System.out.println("1.2 The following data has been successfully submitted:"+"\n"+submittedText.getText());

        }
    }
    ///End Textbox action


    ///Checkbox find element
    @FindBy(id="item-1")
    private WebElement checkbox_tab;
    @FindBy(css=".rct-icon-expand-close")
    private WebElement colpshome;
    @FindBy(css=".rct-node-collapsed:nth-child(1) .rct-collapse > .rct-icon")
    private WebElement colpsdesktop;
    @FindBy(css=".rct-node-leaf:nth-child(2) .rct-checkbox > .rct-icon")
    private WebElement chkCommands;
    @FindBy(css=".rct-node-parent:nth-child(2) .rct-collapse > .rct-icon")
    private WebElement colpsdocument;
    @FindBy(css=".rct-node:nth-child(2) .rct-node:nth-child(1) .rct-collapse > .rct-icon")
    private WebElement colpsworkspace;
    @FindBy(css=".rct-node-leaf:nth-child(3) .rct-checkbox > .rct-icon")
    private WebElement chkVue;
    @FindBy(css=".rct-node-collapsed:nth-child(2) .rct-collapse > .rct-icon")
    private WebElement colpsOffice;
    @FindBy(css=".rct-node:nth-child(4) .rct-checkbox > .rct-icon")
    private WebElement chkGeneral;
    @FindBy(css=".rct-node-parent:nth-child(3) .rct-collapse > .rct-icon")
    private WebElement colpsDownload;
    @FindBy(css=".rct-node:nth-child(3) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")
    private WebElement chkExcel;
    @FindBy(id="result")
    private WebElement displayResult;

    ///End Checkbox find element


    ///Checkbox action
    public void presschkboxTab(){
        this.checkbox_tab.click();
    }
    public void presshome(){
        this.colpshome.click();
    }
    public void pressdesktop(){
        this.colpsdesktop.click();
    }
    public void selectchkCommands(){
        this.chkCommands.click();

    }
    public void pressdocument(){
        this.colpsdocument.click();
    }
    public void presscolpsworkspace(){
        this.colpsworkspace.click();
    }
    public void selectchkVue(){
        this.chkVue.click();
    }
    public void presscolpsOffice(){
        this.colpsOffice.click();
    }
    public void selectchkGeneral(){
        this.chkGeneral.click();
    }
    public void presscolpsDownload(){
        this.colpsDownload.click();
    }
    public void selectchkExcel(){
        this.chkExcel.click();
    }
    public void Validate2(){
        System.out.println("2.Checkbox - Select the Following Checkboxes(Commands, Veu, Classified, General, Excel)");
        System.out.println("2.1 The following checkbox has been selected" +"/n" + displayResult.getText());
    }

    ///End Checkbox action

    ///WebTables find element
    @FindBy(css=".show #item-3 > .text")
    private WebElement WebTables_tab;
    @FindBy(id="item-3")
    private WebElement Edit_btn;
    @FindBy(css="#edit-record-2 > svg")
    private WebElement Edit1_btn;
    @FindBy(id="lastName")
    private WebElement edit_LastName;
    @FindBy(id="salary")
    private WebElement edit_Salary;
    @FindBy(id="age")
    private WebElement edit_Age;
    @FindBy(id="submit")
    private WebElement EditSubmit;
    @FindBy(css=".rt-tr-group:nth-child(2) .rt-td:nth-child(2)")
    private WebElement lnResult;
    @FindBy(css=".rt-tr-group:nth-child(2) .rt-td:nth-child(3)")
    private WebElement ageResult;
    @FindBy(css=".rt-tr-group:nth-child(2) .rt-td:nth-child(5)")
    private WebElement salResult;

    @FindBy(css=".rt-tr-group:nth-child(4) .rt-td:nth-child(1)")
    private WebElement fnResult4;
    @FindBy(css=".rt-tr-group:nth-child(4) .rt-td:nth-child(2)")
    private WebElement lnResult4;
    @FindBy(css=".rt-tr-group:nth-child(4) .rt-td:nth-child(3)")
    private WebElement ageResult4;
    @FindBy(css=".rt-tr-group:nth-child(4) .rt-td:nth-child(4)")
    private WebElement emailResult4;
    @FindBy(css=".rt-tr-group:nth-child(4) .rt-td:nth-child(5)")
    private WebElement salResult4;
    @FindBy(css=".rt-tr-group:nth-child(4) .rt-td:nth-child(6)")
    private WebElement depResult4;

    @FindBy(css=".rt-tr-group:nth-child(5) .rt-td:nth-child(1)")
    private WebElement fnResult5;
    @FindBy(css=".rt-tr-group:nth-child(5) .rt-td:nth-child(2)")
    private WebElement lnResult5;
    @FindBy(css=".rt-tr-group:nth-child(5) .rt-td:nth-child(3)")
    private WebElement ageResult5;
    @FindBy(css=".rt-tr-group:nth-child(5) .rt-td:nth-child(4)")
    private WebElement emailResult5;
    @FindBy(css=".rt-tr-group:nth-child(5) .rt-td:nth-child(5)")
    private WebElement salResult5;
    @FindBy(css=".rt-tr-group:nth-child(5) .rt-td:nth-child(6)")
    private WebElement depResult5;

    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(1)")
    private WebElement fnResult6;
    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(2)")
    private WebElement lnResult6;
    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(3)")
    private WebElement ageResult6;
    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(4)")
    private WebElement emailResult6;
    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(5)")
    private WebElement salResult6;
    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(6)")
    private WebElement depResult6;

    @FindBy(css=".rt-tr-group:nth-child(7) .rt-td:nth-child(1)")
    private WebElement fnResult7;
    @FindBy(css=".rt-tr-group:nth-child(7) .rt-td:nth-child(2)")
    private WebElement lnResult7;
    @FindBy(css=".rt-tr-group:nth-child(7) .rt-td:nth-child(3)")
    private WebElement ageResult7;
    @FindBy(css=".rt-tr-group:nth-child(6) .rt-td:nth-child(4)")
    private WebElement emailResult7;
    @FindBy(css=".rt-tr-group:nth-child(7) .rt-td:nth-child(5)")
    private WebElement salResult7;
    @FindBy(css=".rt-tr-group:nth-child(7) .rt-td:nth-child(6)")
    private WebElement depResult7;

    ///End WebTables find element

    ///Checkbox action
    public void pressWebTables_tab(){
        this.WebTables_tab.click();
    }
    public void pressEdit_btn(){
        this.Edit_btn.click();
    }
    public void pressEdit1_btn(){
        this.Edit1_btn.click();
    }
    public void EditLastName(){
        this.edit_LastName.clear();
        this.edit_LastName.sendKeys(EDIT_LASTNAME);
    }
    public void EditSalary(){
        this.edit_Salary.clear();
        this.edit_Salary.sendKeys(EDIT_SALARY);
    }
    public void EditAge(){
        this.edit_Age.clear();
        this.edit_Age.sendKeys(EDIT_AGE);
    }
    public void pressEditSubmit_btn(){
        this.EditSubmit.click();
    }
    public void Add_btn(){
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Ethel");
        driver.findElement(By.id("lastName")).sendKeys("Atineza");
        driver.findElement(By.id("userEmail")).sendKeys("qaethel0011@gmail.com");
        driver.findElement(By.id("age")).sendKeys("26");
        driver.findElement(By.id("salary")).sendKeys("900000");
        driver.findElement(By.id("department")).sendKeys("QA");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Harold");
        driver.findElement(By.id("lastName")).sendKeys("flores");
        driver.findElement(By.id("userEmail")).sendKeys("harold@gmail.com");
        driver.findElement(By.id("age")).sendKeys("27");
        driver.findElement(By.id("salary")).sendKeys("990000");
        driver.findElement(By.id("department")).sendKeys("UI/UX");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Mahiwaga");
        driver.findElement(By.id("lastName")).sendKeys("flores");
        driver.findElement(By.id("userEmail")).sendKeys("Mahiwaga@gmail.com");
        driver.findElement(By.id("age")).sendKeys("20");
        driver.findElement(By.id("salary")).sendKeys("700000");
        driver.findElement(By.id("department")).sendKeys("Dev");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Elyseen");
        driver.findElement(By.id("lastName")).sendKeys("flores");
        driver.findElement(By.id("userEmail")).sendKeys("Elyseen@gmail.com");
        driver.findElement(By.id("age")).sendKeys("21");
        driver.findElement(By.id("salary")).sendKeys("600000");
        driver.findElement(By.id("department")).sendKeys("PM");
        driver.findElement(By.id("submit")).click();
    }
    public void Validate3() {
        System.out.println("3. Web Tables - Update Alden's Last Name, Age, Salary then validate the update.");
        System.out.println("3.1 Update Alden's record has been successfully updated: "+ "\n Lastname: " +lnResult.getText()+ "\n Age: " +ageResult.getText() + "\n Salary: " +salResult.getText());
        System.out.println("3.2 The following has been successfully added: ");
        System.out.println("3.2.1 Record 1: " + "\n Firstname: " + fnResult4.getText() + "\n Lastname: " + lnResult4.getText() + "\n Age: " + ageResult4.getText() + "\n Email: " + emailResult4.getText() + "\n Salary: " + salResult4.getText() + "\n Department: " + depResult4.getText());
        System.out.println("3.2.2 Record 2: " + "\n Firstname: " + fnResult5.getText() + "\n Lastname: " + lnResult5.getText() + "\n Age: " + ageResult5.getText() + "\n Email: " + emailResult5.getText() + "\n Salary: " + salResult5.getText() + "\n Department: " + depResult5.getText());
        System.out.println("3.2.3 Record 3: " + "\n Firstname: " + fnResult6.getText() + "\n Lastname: " + lnResult6.getText() + "\n Age: " + ageResult6.getText() + "\n Email: " + emailResult6.getText() + "\n Salary: " + salResult6.getText() + "\n Department: " + depResult6.getText());
        System.out.println("3.2.4 Record 4: " + "\n Firstname: " + fnResult7.getText() + "\n Lastname: " + lnResult7.getText() + "\n Age: " + ageResult7.getText() + "\n Email: " + emailResult7.getText() + "\n Salary: " + salResult7.getText() + "\n Department: " + depResult7.getText());

    }
    ///End Checkbox action

    ///Links find element
    @FindBy(id="item-5")
    private WebElement Link;
    @FindBy(id="simpleLink")
    private WebElement Home;
    @FindBy(id="dynamicLink")
    private WebElement HomeUN;

    @FindBy(css="#created")
    private WebElement Link_Created;
    @FindBy(id="no-content")
    private WebElement Link_NoContent;
    @FindBy(id="moved")
    private WebElement Link_Moved;
    @FindBy(id="bad-request")
    private WebElement Link_BadReq;
    @FindBy(id="unauthorized")
    private WebElement Link_Unauthorized;
    @FindBy(id="forbidden")
    private WebElement Link_Forbidden;
    @FindBy(id="invalid-url")
    private WebElement Link_NotFound;

    @FindBy(id="linkResponse")
    private WebElement responseDisplay;
    ///End Links find element

    ///Links action
    public void pressLink(){
        this.Link.click();
        System.out.println("4. Links - Validate Response Codes of each link");
    }
    public void pressHome(){
        this.Home.click();
        System.out.println("4.8 Home Link redirect to: " + driver.getTitle() + " "+  driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressHomeUN(){
        this.HomeUN.click();
        System.out.println("4.9 HomeUN Link redirect to: " + driver.getTitle() + " "+ driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressCreated(){
        this.Link_Created.click();
        System.out.println("4.1 Created Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressNoContent(){
        this.Link_NoContent.click();
        System.out.println("4.2 No Content Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressMoved(){
        this.Link_Moved.click();
        System.out.println("4.3 Moved Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressBadReq(){
        this.Link_BadReq.click();
        System.out.println("4.4 Bad Request Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressUnauthorized(){
        this.Link_Unauthorized.click();
        System.out.println("4.5 Unauthorized Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressForbidden(){
        this.Link_Forbidden.click();
        System.out.println("4.6 Forbidden Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void pressNotFound(){
        this.Link_NotFound.click();
        System.out.println("4.7 Not Found Link Response: " + responseDisplay.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    public void timeout(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}
    ///End Links action

    ///Upload And Download  find element
    @FindBy(css=".show #item-7 > .text")
    private WebElement UploadandDL;
    @FindBy(id="downloadButton")
    private WebElement DownloadButton;
    @FindBy(id="uploadedFilePath")
    private WebElement uploaded;

    ///End Upload And Download  find element

    ///Upload And Download action
    public void pressUploadandDL(){
        this.UploadandDL.click();
        System.out.println("5 Upload and Download - Upload a file, download the sample file.");

    }
    public void pressDownloadButton(){
        this.DownloadButton.click();
        System.out.println("5.1 Download button were clickable- Able to download the sample file");

    }
    public void pressUploadButton() {
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Ethel\\IdeaProjects\\Exam_Automation\\tobeuploaded.txt");
        System.out.println("5.2 Upload button were clickable- Able to upload as sample file: " + uploaded.getText());
    }

    ///End Upload And Download action

    //Practice  find element
    @FindBy(css=".element-group:nth-child(1) .header-wrapper")
    private WebElement Elements;
    @FindBy(css=".element-group:nth-child(2) .header-wrapper")
    private WebElement Forms;
    @FindBy(css=".show #item-0")
    private WebElement PracticeFormTab;
    @FindBy(css=".custom-radio:nth-child(2)")
    private WebElement radGender;
    @FindBy(id = "submit")
    private WebElement submittedPractice;
    @FindBy(css = ".modal-body")
    private WebElement ModalDisplay;

    ///End Practice  find element

    ///Practice action
    public void pressElements(){
        this.Elements.click();
    }
    public void pressForms(){
        this.Forms.click();
    }
    public void pressPracticeFormTab(){
        this.PracticeFormTab.click();
    }
    public void enterFirstname() {
        driver.findElement(By.id("firstName")).sendKeys("Elyseen");
    }
    public void enterLastname() {
        driver.findElement(By.id("lastName")).sendKeys("Flores");
    }
    public void enterUserEmail() {
        driver.findElement(By.id("userEmail")).sendKeys("Flores@gmail.com");
    }
    public void selectGender() {
        this.radGender.click();
    }
    public void enterMobile() {
        driver.findElement(By.id("userNumber")).sendKeys("9966523145");
    }
    public void enterdateOfBirthInput() {
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.cssSelector(".react-datepicker__year-select")).sendKeys("1958");
        driver.findElement(By.cssSelector(".react-datepicker__month-select")).sendKeys("August");
        driver.findElement(By.cssSelector(".react-datepicker__day--012")).click();
    }
    public void Presssubjects() {
        driver.findElement(By.id("subjectsInput")).click();
        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
        driver.findElement(By.id("react-select-2-option-0")).click();
    }
    public void SelectHobbies() {
        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(2) > .custom-control-label")).click();
    }
    public void pressuploadPicture() {
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Ethel\\IdeaProjects\\Exam_Automation\\ea.png");
    }
    public void selectState() {
        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("react-select-3-option-0")).click();

    }
    public void selectCity() {
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();
    }
    public void presssubmittedPractice(){
        this.submittedPractice.click();
    }

    public void Validate6() {
        System.out.println("6. Practice Form - Add the following data ");
        System.out.println("6.1 User were able to add the following - First Name, Last Name, Email, Select Other Gender, Mobile Number,\n" +
                "Select Date of Birth (12 Aug 1985), Upload Picture.");
        System.out.println("6.2 Successfully added:" +"\n"+ModalDisplay.getText());
    }


    //AFS find element
    @FindBy(css=".card:nth-child(3) > div")
    private WebElement afsTab;
    @FindBy(css=".show #item-0 > .text")
    private WebElement BrowserTab;
    @FindBy(id="tabButton")
    private WebElement NewTab;
    @FindBy(id="windowButton")
    private WebElement New_Window;
    @FindBy(id="messageWindowButton")
    private WebElement message_WindowButton;
    ///End AFS  find element

    ///AFS action
    public void pressafsTab() {
        this.afsTab.click();
    }
    public void pressBrowserTab() {
        this.BrowserTab.click();
        System.out.println("7. Browser Windows - Click each button and validate the window that opened");

    }
    public void pressNew_Window() {
        this.New_Window.click();
        System.out.println("7.1 Upon Clicking New Window a new window will open and it redirects to: " +  driver.getCurrentUrl());
    }
    public void pressNewTab() {
        this.NewTab.click();
        System.out.println("7.2 Upon Clicking New Tab it redirects to: " +  driver.getCurrentUrl());

    }

    public void pressmessage_WindowButton() {
        this.message_WindowButton.click();
        System.out.println("7.3 Upon Clicking Message Window a new window will open and redirects to: " + driver.getCurrentUrl());

    }
    public void backBrowserWin() {
        driver.get("https://demoqa.com/browser-windows");
    }

    ///End AFS action


    //Date and time picker find element
    @FindBy(css=".card:nth-child(4) .card-body")
    private WebElement WidgetElement;
    @FindBy(css=".show #item-2 > .text")
    private WebElement DTPickerTab;

    ///End Date and time picker  find element

    ///Date and time picker action
    public void pressWidgetElement() {
        this.WidgetElement.click();

    }
    public void pressDTPickerTab() {
        this.DTPickerTab.click();
        System.out.println("8. Date Picker -  ABle to select the ff");
    }
    public void selectDate() {
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        driver.findElement(By.cssSelector(".react-datepicker__year-select")).sendKeys("1991");
        driver.findElement(By.cssSelector(".react-datepicker__month-select")).sendKeys("October");
        driver.findElement(By.cssSelector(".react-datepicker__day--021")).click();
        System.out.println("8.1 Date 10/21/1991");

    }
    public void selectDateandTime() {
        driver.findElement(By.id("dateAndTimePickerInput")).click();
        driver.findElement(By.cssSelector(".react-datepicker__month-read-view--down-arrow")).click();
        driver.findElement(By.cssSelector(".react-datepicker__month-option:nth-child(10)")).click();
        driver.findElement(By.cssSelector(".react-datepicker__year-read-view")).click();
        for (int i = 0; i < 25; i++) {
            driver.findElement(By.cssSelector(".react-datepicker__navigation--years-previous")).click();
        }
        driver.findElement(By.cssSelector(".react-datepicker__year-option:nth-child(12)")).click();
        driver.findElement(By.cssSelector(".react-datepicker__day--021")).click();
        driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(33)")).click();
        System.out.println("8.2 Date Time October 21, 1991 8:00 AM");

    }
    ///End Date and time picker action

    //Slider find element
    @FindBy(css=".show #item-3 > .text")
    private WebElement SliderTab;
    ///Slider  find element

    ///Slider action
    public void pressSliderTab() {
        this.SliderTab.click();
        WebElement slider = driver.findElement(By.xpath("//div[@id='sliderContainer']/div/span/input"));
        Actions action= new Actions(driver);
        action.click(slider).build().perform();
        for (int i = 0; i < 40; i++)
        {
            action.sendKeys(Keys.ARROW_UP).build().perform();
        }
        System.out.println("9. Slider - Move the slider to: 90" );
    }
    ///End Slider action

    //Select Menu find element
    @FindBy(css=".show #item-8")
    private WebElement SelectMenuTab;
    @FindBy(xpath="//div[@id='withOptGroup']/div/div")
    private WebElement selectValue;
    @FindBy(xpath="//div[@id='selectOne']/div/div")
    private WebElement selectOne;
    @FindBy(id="oldSelectMenu")
    private WebElement oldSelect;
    @FindBy(css=".css-1wa3eu0-placeholder")
    private WebElement multiSelect;

    ///Select Menu  find element

    ///Select Menu action
    public void pressSelectMenuTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        this.SelectMenuTab.click();
        System.out.println("10. Select Menu - Select the following" );
    }
    public void pressselectValue() {
        this.selectValue.click();
        System.out.println("10.1 Able to select: Select Value (Another root option) "  );

     }
    public void selectValueAnother() {
        driver.findElement(By.id("react-select-2-option-3")).click();
        System.out.println("10.2 Able to select: , Select One (Other) "  );
    }
    public void pressselectOne() {
        this.selectOne.click();
     }
    public void selectOneOther() {
        driver.findElement(By.id("react-select-3-option-0-5")).click();
    }
    public void pressoldStyle() {
        this.oldSelect.click();
    }
    public void selectoldStyleViolet() {
        driver.findElement(By.id("oldSelectMenu")).sendKeys("Voilet");
        System.out.println("10.3 Able to select: Old Style (Violet) "  );
    }
    public void pressmultiSelect() {
        this.multiSelect.click();
    }
    public void multiSelect() {
        driver.findElement(By.id("react-select-4-option-1")).click();
        driver.findElement(By.id("react-select-4-option-2")).click();
        System.out.println("10.4 Able to select: Multi Select (Black, Blue) "  );
    }
    ///Select Menu action


}