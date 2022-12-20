package MethodsForLuma;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LumaPrjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	WebDriver driver;
	 public void launchingApp() {
	//Launch the browser
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\chromedriver_win32\\chromedriver.exe");
				  driver=new ChromeDriver();
				 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Navigate the URL
				 driver.navigate().to("https://magento.softwaretestingboard.com/");
				 driver.manage().window().maximize();
		}
	 public void Login() {
			//Click on sign inLink
						WebElement Signin=driver.findElement(By.linkText("Sign In"));
						Signin.click();
			//Enter e-mail address
					    WebElement Email=driver.findElement(By.xpath("//input[@name='login[username]']"));
						 Email.sendKeys("Test155@gmail.com");
			//Enter Password
						WebElement Password=driver.findElement(By.xpath("//input[@name='login[password]']"));
						Password.sendKeys("Test150@12");
			//Click on sign in button
						WebElement Signinbutton=driver.findElement(By.xpath("//button[@id='send2']/span"));
						Signinbutton.click();  
					 }
			 public void Navigatetomen() {
			//Navigate to Men>Tops>Jackets
					    WebElement Men=driver.findElement(By.id("ui-id-5"));
					    Actions Act=new Actions(driver);
						Act.moveToElement(Men).build().perform();
					    WebElement Tops=driver.findElement(By.id("ui-id-17"));
					    Act.moveToElement(Tops).build().perform();
					    WebElement Jackets=driver.findElement(By.id("ui-id-19"));
					    Jackets.click();
					    List<WebElement> beforesortname=driver.findElements(By.xpath("//strong[@class='product name product-item-name']"));
					    System.out.println("    BEFORE SORTING ALBHABET ORDER ");
					       for(int i=0;i<=beforesortname.size()-1;i++) {
					    	   String Beforename=beforesortname.get(i).getText();
					    	   System.out.println(Beforename+ " - "+Beforename.substring(0, 1));
					       }
					 }
				
			 public void Sort() {
			//Sort by Product Name
				       WebElement Dropdown=driver.findElement(By.xpath("//select[@id='sorter']"));
				       Select select=new Select(Dropdown);
				       select.selectByValue("name");
				       List<WebElement> Aftersortname=driver.findElements(By.xpath("//strong[@class='product name product-item-name']"));
				       System.out.println("    AFTER SORTING ALBHABET ORDER ");
				       for(int i=0;i<=Aftersortname.size()-1;i++) {
				    	   String Aftername=Aftersortname.get(i).getText();
				    	   System.out.println(Aftername+ " - "+Aftername.substring(0, 1));
				       }
				       //driver.close();
			}
			 public void navigateGear() {
			//navigate to Gear>Watches
					  WebElement Gear=driver.findElement(By.id("ui-id-6"));
					  Actions Act=new Actions(driver);
					  Act.moveToElement(Gear).build().perform();
					  WebElement Watches=driver.findElement(By.id("ui-id-27"));
					  Watches.click();
					 }
			 public void Review() throws Exception {
			//Click on item
					  WebElement ClamberWatch=driver.findElement(By.linkText("Clamber Watch"));
					  ClamberWatch.click();
			//Add my Review
					  WebElement Review=driver.findElement(By.linkText("Add Your Review"));
			          Review.click();
					  WebElement Star1=driver.findElement(By.xpath("//label[@class='rating-1']"));
					  Actions Act=new Actions(driver);
					  Act.moveToElement(Star1).build().perform();
					  Star1.click();
				    /* WebElement Star2=driver.findElement(By.xpath("//label[@id='Rating_2_label']"));
					   Act.moveToElement(Star2).build().perform();
					   Star2.click();*/
					   Thread.sleep(2000);
					   WebElement Summary=driver.findElement(By.xpath("//input[@id='summary_field']"));
					   Summary.sendKeys("Good product");
					   Thread.sleep(2000);
					   WebElement REview=driver.findElement(By.id("review_field"));
			    		REview.sendKeys("Value for money.Thought to by another one for my Friend.");
					WebElement Submit=driver.findElement(By.xpath("//button[@class='action submit primary']"));
						 Submit.click();
						 
					 }
			 public void ValidateReview() {
					//Validate my review  by Date
						 WebElement Downbutton=driver.findElement(By.xpath("//button[@class='action switch']"));
						 Downbutton.click();
						 WebElement MyAccount=driver.findElement(By.linkText("My Account"));
						 MyAccount.click();
						 WebElement MyOrderReview=driver.findElement(By.linkText("My Product Reviews"));
						 MyOrderReview.click();

						 WebElement TableDate=driver.findElement(By.xpath("//table[@id='my-reviews-table']/tbody/tr[1]/td[1]"));
						 System.out.println("Review given Date Captured - "+TableDate.getText());
		                 driver.close();
					 }

}
