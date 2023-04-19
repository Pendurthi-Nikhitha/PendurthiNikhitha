package pages;
import org.openqa.selenium.By;

import base.Base;

public class Inventorypage  extends Base{
	By products= By.xpath("//span[text()='Products']");
	
	public boolean getheading() {
		if( driver.findElements(products).isEmpty()==false) {
			return true; 
		}
		else {
			return false;
			
		}
		
}

}

