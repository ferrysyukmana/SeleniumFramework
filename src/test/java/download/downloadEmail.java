package download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class downloadEmail {

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
	public void DWLD_01() throws Exception {
		ExtentTest test = extent.createTest("User can't download 002", "DWLD_01");
		
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
		
		Thread.sleep(1000);
		
		//button add backup is displayed
		driver.findElement(By.xpath("(//*[@class=\"btn btn-black round\"])[1]")).isDisplayed();
		test.pass("button add backup is displayed");
		
		Thread.sleep(1000);
		
		//input search 002
		driver.findElement(By.id("searchinput")).sendKeys("002");;
		test.pass("input search 002");
		
		Thread.sleep(1000);
		
		//click button search
		driver.findElement(By.xpath("//button[@class='search-btn btn btn-default round ft ft-search p-0 m-0 font-medium-2']")).click();
		test.pass("click button seacrh");
		
		Thread.sleep(5000);
		
		//check displayed No result found
		driver.findElement(By.xpath("//*[@alt='Empty search']")).isDisplayed();
		test.pass("check displayed No result found");
		
	}
	
	@Test(priority= 3)
	public void DWLD_03() throws Exception {
		ExtentTest test = extent.createTest("User can't download 006", "DWLD_03");
		
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
		
		Thread.sleep(1000);
		
		//button add backup is displayed
		driver.findElement(By.xpath("(//*[@class=\"btn btn-black round\"])[1]")).isDisplayed();
		test.pass("button add backup is displayed");
		
		Thread.sleep(1000);
		
		//input search 002
		driver.findElement(By.id("searchinput")).sendKeys("006");;
		test.pass("input search 002");
		
		Thread.sleep(1000);
		
		//click button search
		driver.findElement(By.xpath("//button[@class='search-btn btn btn-default round ft ft-search p-0 m-0 font-medium-2']")).click();
		test.pass("click button seacrh");
		
		Thread.sleep(5000);
		
		//check displayed No result found
		driver.findElement(By.xpath("//*[@alt='Empty search']")).isDisplayed();
		test.pass("check displayed No result found");
		
	}
	
	
	@Test(priority= 2)
	public void DWLD_02() throws Exception {
		ExtentTest test = extent.createTest("User can download email as EML all folder", "DWLD_02");
		
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
		
		Thread.sleep(1000);
		
		//button add backup is displayed
		driver.findElement(By.xpath("(//*[@class=\"btn btn-black round\"])[1]")).isDisplayed();
		test.pass("button add backup is displayed");
		
		Thread.sleep(1000);
		
		//input search 002
		driver.findElement(By.id("searchinput")).sendKeys("004");;
		test.pass("input search 002");
		
		Thread.sleep(1000);
		
		//click button search
		driver.findElement(By.xpath("//button[@class='search-btn btn btn-default round ft ft-search p-0 m-0 font-medium-2']")).click();
		test.pass("click button search");
		
		Thread.sleep(5000);
		
		//check displayed found
		driver.findElement(By.xpath("//a[@class='account-name']")).isDisplayed();
		test.pass("check displayed found");
		
		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//a[@class='account-name']"));
		
		actions.moveToElement(menuOption).perform();
		
		Thread.sleep(2000);
		
		//click icon download
		driver.findElement(By.xpath("(//*[@class='d-none d-xl-inline button-text'])[3]")).click();
		test.pass("click icon download");
		
		Thread.sleep(1000);
		
		Actions actions1 = new Actions(driver);
		WebElement menuOption1 = driver.findElement(By.xpath("(//a[contains(text(),'Email')])[3]"));
		
		//hover link email
		actions1.moveToElement(menuOption1).perform();
		test.pass("hover link email");
		
		Thread.sleep(1000);
		
		//click link EML
		driver.findElement(By.xpath("//a[contains(text(),'EML')]")).click();
		test.pass("click link EML");
		
		Thread.sleep(1000);
		
		//checked Concepten
		driver.findElement(By.xpath("//input[@value='58654']")).click();
		test.pass("checked Concepten");
		
		Thread.sleep(1000);
		
		//click Generate Download
		driver.findElement(By.xpath("//input[@value='Generate Download']")).click();
		test.pass("clink Generate Download");
		
		Thread.sleep(1000);
		
		//click Yes, Coninue
		driver.findElement(By.xpath("(//button[contains(text(),'Yes, Continue')])[2]")).click();
		test.pass("click Yes, Continue");
		
		Thread.sleep(1000);
		
		//showing notif download
		driver.findElement(By.xpath("//*[@class='toast-message']")).isDisplayed();
		test.pass("suksess download");
		
		Thread.sleep(1000);
		
		//check displayed found
//		driver.findElement(By.xpath("//a[@class='account-name']")).
//		test.pass("check displayed found");
		
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
