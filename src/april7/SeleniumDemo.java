package april7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) {


     //Webdriver driver2 = new FirefoxDriver();

//Setup
     System.setProperty("webdriver.chrome.driver","C:\\Selenium\\BrowserDrivers\\chromedriver.exe");

     // 1. Open a browser

        WebDriver driver = new ChromeDriver();

        // 2. Navigate to Google.com

        driver.get("https://www.google.com/");

        // 3. Verify that the page title is Google

       // String actualTitle = driver.getTitle();

        String expectedTitle = "Google ";

        String actualTitle = driver.getTitle();

      //  System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)){

            System.out.println("Test Case PASSED " + "Actual title " + actualTitle +
                    " matches the expected title " + expectedTitle);
        }else {
            System.out.println("Test Case FAILED " + "Actual title " + actualTitle +
                    " The expected title " + expectedTitle);
        }

        //4.Verify that the page url is https://www.google.com/

        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)){

            System.out.println("Test Case PASSED " + "Actual URL " + actualURL +
                    " matches the expected URL " + expectedURL);
        }else {
            System.out.println("Test Case FAILED " + "Actual URL " + actualURL +
                    " The expected URL " + expectedURL);
        }

       /* System.out.println("THE PAGE SOURCE");
        System.out.println("-------------------------------------------------");

        String source = driver.getPageSource();

        System.out.println(source);

*/
        //4.Verify that the page url is https://www.google.com/

        //4. Verify that the word about is part of this page

        String str = "About";
        String source = driver.getPageSource();

        if(source.contains(str)) {

            System.out.println("PASS");
        }else{
            System.out.println("FAIL. The page does not contain the word " + str);

        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



            driver.quit();
        }}







