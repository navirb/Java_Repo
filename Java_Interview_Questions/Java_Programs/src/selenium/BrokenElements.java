package selenium;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenElements {
	
	/*
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the webpage
	        driver.get("https://example.com");

	        // Find all image elements on the page
	        java.util.List<WebElement> images = driver.findElements(By.tagName("img"));

	        // Check each image for being broken
	        for (WebElement image : images) {
	            String src = image.getAttribute("src");
	            try {
	                HttpResponse response = HttpClientBuilder.create().build().execute(new HttpGet(src));
	                int statusCode = response.getStatusLine().getStatusCode();
	                if (statusCode != 200) {
	                    System.out.println("Broken image found: " + src);
	                }
	            } catch (Exception e) {
	                System.out.println("Error occurred while checking image: " + src);
	            }
	        }

	        // Close the browser
	        driver.quit();
	    }
	}

*/
}
