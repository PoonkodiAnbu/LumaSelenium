package UItest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MethodsForLuma.LumaPrjects;


public class Luma5and14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	@Test
	public void ItemDisplay() {
		LumaPrjects ObjItem=new LumaPrjects();
		ObjItem.launchingApp();
		ObjItem.Login();
		ObjItem.Navigatetomen();
		ObjItem.Sort();
		
	}
@Test
public void MyReview() throws Exception {
	LumaPrjects ObjMyReview=new LumaPrjects();
	ObjMyReview.launchingApp();
	ObjMyReview.Login();
	ObjMyReview.navigateGear();
	ObjMyReview.Review();
	ObjMyReview.ValidateReview();
}
}
