package homeassignment.day2;

public class Browser {
	 public String launchBrowser(String browserName,int seconds) {
		 		 return browserName+" "+seconds;
		}
	 
		public void loadUrl() {
			System.out.println("Url loaded successfully");
			
		}
		public static void main(String[] args) {
			Browser b=new Browser();
			System.out.println(b.launchBrowser("chrome",90));
			b.loadUrl();
		}

	}

