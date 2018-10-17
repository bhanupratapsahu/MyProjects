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
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    	public static WebDriver driver;
     
    	public static void main(String[]  args) throws MalformedURLException, InterruptedException{
     
     		String URL = "http://www.google.com";
     		String Node = "http://55.55.52.175:4444/wd/hub";
     		DesiredCapabilities cap = DesiredCapabilities.chrome();
     
     		driver = new RemoteWebDriver(new URL(Node), cap);
     
     		driver.navigate().to(URL);
     		Thread.sleep(5000);
     		driver.quit();
     	}		
}
