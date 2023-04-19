package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class Base {
	protected static WebDriver driver;
	 public void setUp()
	   {
		 
		 
		/* System.setProperty("webdriver.edge.verboseLogging", "true");
	   EdgeDriverService service = EdgeDriverService.createDefaultService();

	   EdgeDriver driver = new EdgeDriver(service);*/
		  ChromeOptions opt= new ChromeOptions();
		   opt.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(opt);
		   
		   /*EdgeOptions options = new EdgeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver(options);*/
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   }
	   public void openUrl(String url)
	   {
		   driver.get(url);
	   }
	   public void tearDown()
	   {
		   driver.quit();
	   }


}
