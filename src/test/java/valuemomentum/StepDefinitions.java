package valuemomentum;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 

import java.util.Iterator;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class StepDefinitions {
    
    WebDriver driver;
        @Given("User is on Home Page")
        public void user_is_on_home_page() {
            
        	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
             driver =new ChromeDriver();
             driver.navigate().to("https://amazon.in");
             driver.manage().window().maximize();
            
        }

 

        @Then("User enters search keyword")
        public void user_enters_search_keyword() {
            
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
            
        }
        @When("User hits on search button")
        public void user_hits_on_search_button() {
            
            
            driver.findElement(By.id("nav-search-submit-button")).click();
            

 

        }
        @Then("user should land in results page")
        public void user_should_land_in_results_page() {
            
            driver.findElement(By.xpath("(//*[text()='New Apple iPhone 11 (128GB) - Purple'])[1]")).click();
            
            String currentWindow=driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> ite = windows.iterator();
            while(ite.hasNext())
            {
                String newWindow=ite.next();
                if(!currentWindow.equals(newWindow))
                {
                    driver.switchTo().window(newWindow);
                }
            }
            
            
        }
        
        
        
        @Then("user should click on add to cart")
        public void user_should_click_on_add_to_cart() {
            
            driver.findElement(By.id("add-to-cart-button")).click();
            
        }

     
        	@Then("user should close the window")
        	public void user_should_close_the_window() {
        	 driver.close();
        	 driver.quit();
        	}



    
}



