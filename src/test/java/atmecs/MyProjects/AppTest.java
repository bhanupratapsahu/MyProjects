package atmecs.MyProjects;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public static WebDriver driver;
    @Test
    public void shouldAnswerWithTrue() throws MalformedURLException, InterruptedException
    {
        assertTrue( true );
        String URL = "http://www.google.com";
     		String Node = "http://55.55.53.205:4444/wd/hub";
     		DesiredCapabilities cap = DesiredCapabilities.chrome();
     		System.out.println("Inside");
     		driver = new RemoteWebDriver(new URL(Node), cap);
     
     		driver.navigate().to(URL);
            System.out.println("Opening Chrome");
     		Thread.sleep(5000);
     		driver.quit();
    }
    
    	
     
    	public static void main(String[]  args) throws MalformedURLException, InterruptedException{
     
     		String URL = "http://www.google.com";
     		String Node = "http://10.10.10.232:4444/wd/hub";
     		DesiredCapabilities cap = DesiredCapabilities.chrome();
     
     		driver = new RemoteWebDriver(new URL(Node), cap);
     
     		driver.navigate().to(URL);
            System.out.println("Opening Chrome");
     		Thread.sleep(5000);
     		driver.quit();
     	}		
}
