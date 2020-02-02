//TC002 search for a specific user


package Java_works;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Practice_Automation {
	public static void main(String[] args) throws InterruptedException {
			
		//call chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbdelgawadM3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	    //set Chrome Driver language to English
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--lan=en- GB");
		
		//create instance for Chrome web driver
		WebDriver driver = new ChromeDriver();
		
		//open URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//maximize the web page
	    driver.manage().window().maximize();
	    System.out.println("the page has been maximized");
	    
	    //locate login buttons by xpath
	    WebElement UserName = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
	    UserName.sendKeys("admin");
	    WebElement PassWord = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	    PassWord.sendKeys("admin123");
	    Thread.sleep(5000);
	    
	    // click the button login
	    WebElement Login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
	    Login.click();
	    Thread.sleep(5000);
	    
	    //Print a confirmation message
	    System.out.println("login done successfully");
	    
	    // locating the admin menu by full xpath
	    WebElement Admin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b"));
	    WebElement User_Managment = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
	    
       //creating action instance and passing our driver to id
	    Actions action = new Actions(driver);
	    
	    //moving to the menu first, then to an item inside it which was located by its text.
	    action.moveToElement(Admin).moveToElement(User_Managment).moveToElement(driver.findElement(By.xpath("//*[contains(text(),'" + "Users" + "')]"))).click().build().perform();
	    Thread.sleep(3000);
	    
	    //Go to Username field and search by ID
	    WebElement User_Name = driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]"));
	    User_Name.sendKeys("robert.craig");
	    Thread.sleep(5000);
	    
	    //click on button search
	    WebElement Search = driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
	    Search.click();
	    
	    System.out.println("action done successfullys");

	    
	    		
	    
	    	    
	    
	}

}