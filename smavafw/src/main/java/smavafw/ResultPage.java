package smavafw;


public class ResultPage {
	
	String title = "smava Kreditantrag";
	String bottomText ="�bertragung Ihrer Angaben erfolgt �ber Sicherheitsserver";

		public boolean isAt() {
			
			return Browser.title().equals(title);
		}

		public boolean isLoaded() {
			
			return Browser.BottomText().equals(bottomText);
		}

	}


