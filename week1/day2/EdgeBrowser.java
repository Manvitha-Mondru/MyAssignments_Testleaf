package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		
		Browser lB=new Browser();
		String BrowserLaunch= lB.launchBrowser("Edge");
		System.out.println("Launch Browser:" + BrowserLaunch);
		lB.loadUrl();
	}

}
