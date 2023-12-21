package week1.day2;

public class Browser {

	public static void main(String[] args) {
		Browser start = new Browser();
		start.launchBrowser("mani");
		start.loadUrl();

	}

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully "+browserName);
		return browserName;
	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

}
