package webdirve;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_02_Data_type {

	public static void main(String[] args) {
		//* Kiểu dữ liệu nguyên thuỷ rimitieve) : 4 kiểu chính 
		//+ Số nguyên: byte/ short/ int/ long : Kích thước / độ rộng lưu trữ dữ liệu (Không có phần thập phân )
		byte bNumber = 120;
		short sNumber = 32000;
		int iNumer = 3289324;
		long lNumber = 238423943;
		//+ Kiểu số thực : float / double (Có phần thập phân )
		float studentPoint = 9.5f;
		double employeeSalary = 35.5d;
		//+ Logic: boolean 
	    boolean status = true ;
	    status = false;
		//+ Kí tự: char 
		char a ='A';
	    //* Kiểu dữ liệu tham chiếu (Reference) 
		//+ Class 
		FirefoxDriver driver = new FirefoxDriver();
		//+ Interface 
		WebElement firstNameTextbox;
		//+ String 
		String firstName ="Automation Testing";
		//+ Object 
		Object people;
		//+ Array 
		String[] studentName = {"Nguyen Xuan Bang","Pham Thi Dien","Nguyen Xuan Viet Anh"};
		//+ Collection: List/ Set /Queue 
		List<WebElement> checkboxes = driver.findElements(By.cssSelector(""));//tim tat ca cac thuoc tinh
		//+ Map 
		Map<String, Integer> student = new HashMap<String, Integer>();

	}

}
