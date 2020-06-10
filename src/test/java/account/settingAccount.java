package account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class settingAccount {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver; 
	
	@BeforeClass
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("myReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		

	}
	

	@BeforeTest
	public void setUpTest() {
		String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/driver/chromedriver/chromedriver");
		
	}

	
	@Test(priority= 1)
	public void ACCN_01() throws Exception {
		ExtentTest test = extent.createTest("User can changes personal data", "ACCN_01");
		
		driver = new ChromeDriver();
		//open chrome browser
		driver.get("https://staging.dropmyemail.com/");
		test.pass("Navigate to https://staging.dropmyemail.com/");

		//click button SIGN IN
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-sm btn-default start-your-engine start-trial-button-main')]")).click();
		test.pass("Click Button SIGN IN");
		
		Thread.sleep(5000);
		
		//input user email
		driver.findElement(By.id("user_email")).sendKeys("ferry.syukmana@mail.com");;
		test.pass("input user email");
		
		Thread.sleep(1000);
		
		//enter text in search box
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		test.pass("Click Button Next");
		
		Thread.sleep(2000);
		
		//Click Software Tester Engineer
		driver.findElement(By.xpath("//h5[@title='Software Tester Engineer Candidate - Ferry']")).click();
		test.pass("Click Software Tester Engineer");
		
		Thread.sleep(1000);
		
		//enter user password
		driver.findElement(By.id("user_password")).sendKeys("iiaFt=x5'M(T");;
		test.pass("input user password");
		
		Thread.sleep(1000);
		
		//Click button login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		test.pass("Click Button Login");
		
		Thread.sleep(5000);
		
		//button add backup is displayed
		driver.findElement(By.xpath("(//*[@class=\"btn btn-black round\"])[1]")).isDisplayed();
		test.pass("button add backup is displayed");
		
		Thread.sleep(1000);
		
		//click menu setting
		driver.findElement(By.xpath("//span[@class='avatar avatar-md']")).click();
		test.pass("click menu setting");
		
		Thread.sleep(1000);
		
		
		//click account settings
		driver.findElement(By.xpath("//a[@href='/v2/en/account/edit']/i")).click();
		test.pass("click account settings");
		
		Thread.sleep(2000);
		
		//account setting page
		driver.findElement(By.xpath("//span[contains(text(),'Account Settings')]")).isDisplayed();
		test.pass("account setting page");
		
		//update first name
		driver.findElement(By.id("account_first_name")).clear();
		driver.findElement(By.id("account_first_name")).sendKeys("Ferry");
		test.pass("update first name");
		
		//update last name
		driver.findElement(By.id("account_last_name")).clear();
		driver.findElement(By.id("account_last_name")).sendKeys("Syukmana");
		test.pass("update last name");

		//update country
		driver.findElement(By.xpath("//option[@value='ID']")).click();
		test.pass("update country");
		
		//update time zone
		driver.findElement(By.xpath("//option[@value='Jakarta']")).click();
		test.pass("update time zone");
		
		//update postal code
		driver.findElement(By.id("account_postal_code")).clear();
		driver.findElement(By.id("account_postal_code")).sendKeys("17111");
		test.pass("update postal code");
		
		//update address 1
		driver.findElement(By.id("account_address_1")).clear();
		driver.findElement(By.id("account_address_1")).sendKeys("Kp. Pedurenan Gg.Usir RT 02/05 No.110, Duren Jaya, Bekasi Timur, Kota Bekasi");
		test.pass("update address 1");
		
		//update address 2
		driver.findElement(By.id("account_address_2")).clear();
		driver.findElement(By.id("account_address_2")).sendKeys("Perum. Graha Cipta Tamansari Blok B1/4, Desa Tamansari, Setu, Kab. Bekasi");
		test.pass("update address 2");
		
		//update website tokopedia saja
		driver.findElement(By.id("account_website")).clear();
		driver.findElement(By.id("account_website")).sendKeys("https://www.tokopedia.com/");
		test.pass("update website tokopedia saja");
		
		//click button Save Changes
		driver.findElement(By.xpath("(//input[@value='Save Changes'])[1]")).click();
		test.pass("click button Save Changes");
		
		//showing notif download
		driver.findElement(By.xpath("//*[@class='toast-message']")).isDisplayed();
		test.pass("suksess download");
		
		Thread.sleep(5000);
		
		
		
	}
	
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		
		driver.quit();

	}

	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
		extent.flush();
	}


}
