package SetupClass.TestStep;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sign_up extends Set{
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^Open the Website URL su\\.$")
	public void open_the_Website_URL_su() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		Thread.sleep(8000);
	    driver.manage().deleteAllCookies();
	    Thread.sleep(3500);
	    
	    WebElement sign_up_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Sign up')]")));
	    Thread.sleep(4000);
	    sign_up_btn.click();
	    Thread.sleep(7500);
	}

	@Then("^enter new email su\\.$")
	public void enter_new_email_su() throws Throwable {
	   //generate new email
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	        (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	    System.out.println(generatedString);
	    String signup_email=generatedString;
	    String full_email="selenium.testing."+generatedString+"@gmail.com";
	    System.out.println(full_email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		Thread.sleep(4000);
	    WebElement new_email_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_address")));
		Thread.sleep(4000);
	    new_email_signup.sendKeys(full_email);
		Thread.sleep(4000);
	}

	@Then("^enter firstname and lastname su\\.$")
	public void enter_firstname_and_lastname_su() throws Throwable {
		WebElement new_fname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstname")));
		Thread.sleep(4000);
	    new_fname_signup.sendKeys("Selenium");
		Thread.sleep(4000);

	    WebElement new_lname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("lastname")));
		Thread.sleep(4000);
	    new_lname_signup.sendKeys("Testing");
		Thread.sleep(4000);
	}

	@Then("^enter password and confirm password su\\.$")
	public void enter_password_and_confirm_password_su() throws Throwable {
		 WebElement new_pwd_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		 Thread.sleep(4000);
		 new_pwd_signup.sendKeys("selenium@123");
	     Thread.sleep(4000);

		 WebElement new_pwd1_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-confirmation")));
		 Thread.sleep(4000);
		 new_pwd1_signup.sendKeys("selenium@123");
	     Thread.sleep(4000);
	}

	@Then("^enter captcha su\\.$")
	public void enter_captcha_su() throws Throwable {
		WebElement new_captcha_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("captcha_user_create")));
		Thread.sleep(4000);
	    new_captcha_signup.sendKeys("Aj7W2mtf9namwf55");
	}

	@Then("^click on sign up button su\\.$")
	public void click_on_sign_up_button_su() throws Throwable {
		WebElement new_btn_signup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Sign Up')]")));
		Thread.sleep(4000);
	    new_btn_signup.click();
		Thread.sleep(4000);
	}

	@Then("^download a free product su\\.$")
	public void download_a_free_product_su() throws Throwable {
		WebElement free_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Free PPTs')]")));
		Thread.sleep(4000);
	    free_ppt.click();
		Thread.sleep(4000);
		
		WebElement ppt_one = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#maincontent > div.columns > div > div.container.listing-container > div.products.wrapper.grid.products-grid > ol > li:nth-child(3) > div > div > strong > span > a")));
		Thread.sleep(6000);
	    ppt_one.click();
		Thread.sleep(4900);
		
		WebElement download_p = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Download this presentation')]")));
		Thread.sleep(4000);
	    download_p.click();
		Thread.sleep(8000);
		

		   try
		   {
			   Thread.sleep(3000);
			   driver.get("https://test:!test123!@www1.slideteam.net");
			   Thread.sleep(3000);
		   }
		   catch (Exception e) {
			// TODO: handle exception
		}
		
		// Newly Added
		WebElement new_add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Newly Added')]")));
		Thread.sleep(4000);
	    new_add.click();
		Thread.sleep(4000);
		
		WebElement ppt_new = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#maincontent > div.columns > div > div.container.listing-container > div.products.wrapper.grid.products-grid > ol > li:nth-child(2) > div > div > strong > span > a")));
		Thread.sleep(4000);
	    ppt_new.click();
		Thread.sleep(4000);
		

		WebElement download_new = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Download this presentation')]")));
		js.executeScript("arguments[0].scrollIntoView();",download_new);
		Thread.sleep(4000);
	    download_new.click();
		Thread.sleep(8000);
		

		   try
		   {
			   Thread.sleep(3000);
			   driver.get("https://test:!test123!@www1.slideteam.net");
			   Thread.sleep(3000);
		   }
		   catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("^delete the new account created su\\.$")
	public void delete_the_new_account_created_su() throws Throwable {
		driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
		 Thread.sleep(3000);
		 

		   // close chat window
		   try {
				WebElement iframe = driver.findElement(By.id("livechat-full-view"));
				if(iframe.isDisplayed()) {
					driver.switchTo().frame(iframe);   
					 Actions act = new Actions(driver);
					 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
					 Thread.sleep(2000);
						WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
						 Thread.sleep(1000);
							chat1.click();
							 Thread.sleep(1000);
							 driver.switchTo().defaultContent();
							 Thread.sleep(1000);
							 driver.switchTo().parentFrame();
						 Thread.sleep(1000);
				}
				else {
					

				System.out.println("chat window does not open");
				}
			}
					catch(NoSuchElementException NCP) {
						
					}
		   
		   WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		   Thread.sleep(3000);
		   delete_account.click();
		   Thread.sleep(3500);
		   // close chat window
		   try {
				WebElement iframe = driver.findElement(By.id("livechat-full-view"));
				if(iframe.isDisplayed()) {
					driver.switchTo().frame(iframe);   
					 Actions act = new Actions(driver);
					 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
					 Thread.sleep(2000);
						WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
						 Thread.sleep(1000);
							chat1.click();
							 Thread.sleep(1000);
							 driver.switchTo().defaultContent();
							 Thread.sleep(1000);
							 driver.switchTo().parentFrame();
						 Thread.sleep(1000);
				}
				else {
					

				System.out.println("chat window does not open");
				}
			}
					catch(NoSuchElementException NCP) {
						
					}
		   WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Continue')]")));
		   Thread.sleep(3000);
		   continue_delete.click();
		   Thread.sleep(5000);
	}



}
