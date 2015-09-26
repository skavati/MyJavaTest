package MyTestPac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

 public static void main(String[] args) {
  WebDriver driver = new InternetExplorerDriver();
  driver.get("http://" + GlobalVariables.iPOSServer + "/iPOS/Web/Login.aspx");
//  String i = driver.getCurrentUrl();
//  System.out.println(i);
//  driver.close();
//  PageObjectModel page = new PageObjectModel();   
//  BaseMethods.KeyInElement(page.UserNameText, "rh");            
//  BaseMethods.KeyInElement(page.PasswordText, "rh1");           
//  BaseMethods.ClickElement(page.LoginButton);
//  System.out.println("User name and password entered");            
//  BaseMethods.SwitchFrame("mainFrame");
//  BaseMethods.SwitchFrame("topFrame");            
//  BaseMethods.ClickElement(page.Create);        
  // Recovered project
  
 }
}