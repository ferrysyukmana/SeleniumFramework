package login;

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

public class loginTest {

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
	
	@Test(priority= 2)
	public void LG_02() throws Exception {
		ExtentTest test = extent.createTest("User failed login when email fialed", "LG_02");
		
		driver = new ChromeDriver();
		
		//open chrome browser
		driver.get("https://staging.dropmyemail.com/");
		test.pass("Navigate to https://staging.dropmyemail.com/");

		//click button SIGN IN
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-sm btn-default start-your-engine start-trial-button-main')]")).click();
		test.pass("Click Button SIGN IN");
		
		Thread.sleep(5000);
		
		//input user email failed
		driver.findElement(By.id("user_email")).sendKeys("jhkkk@hhh.com");;
		test.pass("input user email failed");
		
		Thread.sleep(1000);
		
		//click button next
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		test.pass("Click Button Next");
		
		Thread.sleep(1000);
		
		//check danger displayed yexy
		driver.findElement(By.xpath("//*[@class='pl-3 text-danger text-right font-small-3']")).isDisplayed();
		test.pass("check danger displayed text");

	}

	
	@Test(priority= 1)
	public void LG_01() throws Exception {
		ExtentTest test = extent.createTest("User success login with input username and password", "LG_01");
		
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
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority= 3)
	public void LG_03() throws Exception {
		ExtentTest test = extent.createTest("User failed login when email pass and pass fail", "LG_03");
		
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
		
		//enter user password failed
		driver.findElement(By.id("user_password")).sendKeys("salahcoy");;
		test.pass("input user password failed");
		
		Thread.sleep(1000);
		
		//Click button login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		test.pass("Click Button Login");
		
		Thread.sleep(1000);
		
		//Invalid password displayed
		driver.findElement(By.xpath("//div[@class='pl-3 text-danger text-right font-small-3 mb-2']")).isDisplayed();
		test.pass("Invalid password");
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority= 4)
	public void LG_04() throws Exception {
		ExtentTest test = extent.createTest("User success login with input username and password but user failed choose division", "LG_04");
		
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
		
		//Click Delegated User
		driver.findElement(By.xpath("//h5[@title='Delegated User']")).click();
		test.pass("Click Delegated User");
		
		Thread.sleep(1000);
		
		//enter user password
		driver.findElement(By.id("user_password")).sendKeys("iiaFt=x5'M(T");;
		test.pass("input user password");
		
		Thread.sleep(1000);
		
		//Click button login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		test.pass("Click Button Login");
		
		Thread.sleep(1000);
		
		//Invalid password displayed
		driver.findElement(By.xpath("//div[@class='pl-3 text-danger text-right font-small-3 mb-2']")).isDisplayed();
		test.pass("Invalid password");
		
		Thread.sleep(2000);
		
		
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
