package day45_Abstraction.browserTask;

public class DriverObjects {
    public static void main(String[] args) {


        ChromeDriver chromeDriver= new ChromeDriver("Chrome");

        chromeDriver.get("https://www.amazon.com");
        chromeDriver.findElements("xpath");
        chromeDriver.findElement("ccsSelector");
        chromeDriver.close();
        chromeDriver.quit();
        chromeDriver.getTitle();
        chromeDriver.takeScreenShot();
        chromeDriver.executeScript("Script");

        System.out.println("--------------------------------------");

        EdgeDriver edgeDriver= new EdgeDriver("Edge");

        edgeDriver.get("https://www.gogle.com");
        edgeDriver.findElements("xpath");
        edgeDriver.findElement("ccsSelector");
        edgeDriver.close();
        edgeDriver.quit();
        edgeDriver.getTitle();
        edgeDriver.takeScreenShot();
        edgeDriver.executeScript("Script");

        System.out.println("--------------------------------------");

        FireFoxDriver firefoxDriver= new FireFoxDriver("Firefox");

        firefoxDriver.get("https://www.gogle.com");
        firefoxDriver.findElements("xpath");
        firefoxDriver.findElement("ccsSelector");
        firefoxDriver.close();
        firefoxDriver.quit();
        firefoxDriver.getTitle();
        firefoxDriver.takeScreenShot();
        firefoxDriver.executeScript("Script");

        System.out.println("--------------------------------------");

        SafariDriver safariDriver= new SafariDriver("Safari");
        safariDriver.get("https://www.gogle.com");
        safariDriver.findElement("xpath");
        safariDriver.findElements("cssSelector");
        safariDriver.close();
        safariDriver.quit();
        safariDriver.getTitle();
        safariDriver.takeScreenShot();
        safariDriver.executeScript("script");

        System.out.println("------------------------------------------");

        OperaDriver operaDriver=new OperaDriver("Opera");

        operaDriver.get("https://www.gogle.com");
        operaDriver.findElement("xpath");
        operaDriver.findElements("cssSelector");
        operaDriver.close();
        operaDriver.quit();
        operaDriver.getTitle();
        operaDriver.takeScreenShot();
        operaDriver.executeScript("script");


    }









}
