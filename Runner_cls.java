package Org.Apache.maven.archetypes.Maven.Archetype.Quickstart;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Com.pom.Add_cart;
import Com.pom.Checkout_1;
import Com.pom.Checkout_2;
import Com.pom.Checkout_3;
import Com.pom.Checkout_5;
import Com.pom.Checkout_6;
import Com.pom.Frame;
import Com.pom.Home_page;
import Com.pom.Login_page;
import Com.pom.Page_Object_Manager;
import Com.pom.T_shirt;
import Com.pom.Tshirt_img;
import Com.pom.proceed_ck;

public class Runner_cls extends Base_class {
public static WebDriver sasi=getBrowser("chrome");
public static Page_Object_Manager pom =new Page_Object_Manager (sasi);
public static Logger log = Logger.getLogger(Runner_cls.class);
public static Home_page hp=new Home_page(sasi);
public static Login_page lp=new Login_page(sasi);
public static T_shirt ts=new T_shirt(sasi);
public static Tshirt_img Tm=new Tshirt_img(sasi);
public static Frame f=new Frame(sasi);
public static Add_cart ac=new Add_cart(sasi);
public static proceed_ck pc=new proceed_ck(sasi);
public static Checkout_1 pc1=new Checkout_1(sasi);
public static Checkout_2 pc2=new Checkout_2(sasi);
public static Checkout_3 pc3=new Checkout_3(sasi);
public static Checkout_5 pc5=new Checkout_5(sasi);
public static Checkout_6 pc6=new Checkout_6(sasi);

static public void main(String[] args) throws InterruptedException, IOException {
	PropertyConfigurator.configure("log4j.properties");
		get("http://automationpractice.com/");
		log.info("Browser Lanch");
		clickOnElement(pom.getInstanceHp().getSignin_bt());
		String username=particular_data("C:\\Users\\NEW\\eclipse-workspace\\Maven.Archetype.Quickstart\\Testcase_1.xlsx",2,5);
		inputValues(pom.getInstanceLp().getEmail(),username);
		String password=particular_data("C:\\Users\\NEW\\eclipse-workspace\\Maven.Archetype.Quickstart\\Testcase_1.xlsx",7,5);
		inputValues(pom.getInstanceLp().getPassword(),password);
		clickOnElement(pom.getInstanceLp().getLogin());
		log.info("login successfully");
		clickOnElement(pom.getInstanceTs().getTshirt());
		clickOnElement(pom.getInstanceTm().getTshirt_img());
		Thread.sleep(3000);
	    sasi.switchTo().frame(f.getSwitchto());
	    Thread.sleep(3000);
	    clickOnElement(pom.getInstanceAc().getAddtocart());
	    log.info("choose the favo Tshirt");
	    sasi.switchTo().defaultContent();
	    Thread.sleep(5000);
        clickOnElement(pom.getInstancePc().getProceed_ck());
		clickOnElement(pom.getInstancepc1().getCheckout_1()); 
		JavascriptExecutor js =(JavascriptExecutor) sasi;
		js.executeScript("window.scrollBy(0,850);");
		clickOnElement(pom.getInstancepc2().getCheckout_2());
		clickOnElement(pom.getInstancepc3().getCheckout_3());
		Thread.sleep(3000);
		log.info("payment method completed");
		clickOnElement(pom.getInstancepc3().getCheckout_11());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,550);");
		clickOnElement(pom.getInstancepc5().getCheckout_5());
		js.executeScript("window.scrollBy(0,850);");
		Thread.sleep(3000);
		clickOnElement(pom.getInstancepc6().getCheckout_6());
		log.info("order success");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350);");
		TakesScreenshot ts=(TakesScreenshot) sasi;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\NEW\\eclipse-workspace\\selenium_purple\\screenshort\\pic5.png");
		FileUtils.copyFile(source, destination);
		}

private static String particular_data(String string) {
	// TODO Auto-generated method stub
	return null;
}



		
	}
	
		
	
		
	
		
	
		
	
		
	
		
	
	

	
		

		
		
		
		
		
		
		
		
		
		
        
        
        
        
	   
	   
	    
	    
        
        
        
        
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		

