package com.nmims.selenium.studentportal.pageObjectMethod;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.nmims.selenium.studentportal.pageObject.UserDtailsPageObject;



public class UserDtailsPageObjectMethod extends UserDtailsPageObject {


	public UserDtailsPageObjectMethod(WebDriver driver) {
		super(driver);
	}

	public List<String> fetchTextValuesFromUI(WebDriver driver, String xpath) {
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        List<String> actualTextValues = new ArrayList<String>();

        for (WebElement element : elements) {
            actualTextValues.add(element.getText());
        }

        return actualTextValues;
    }
	
	public  String setStudentName() {
		
	 String studentNameOnUI=studentName.getText();
	 System.out.println("studentNameOnUI " +studentNameOnUI);
	 return studentNameOnUI;
	}
	


}
