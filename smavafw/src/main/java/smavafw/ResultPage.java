package smavafw;


public class ResultPage {
	
	String title = "smava Kreditantrag";
	String bottomText ="Übertragung Ihrer Angaben erfolgt über Sicherheitsserver";

		public boolean isAt() {
			
			return Browser.title().equals(title);
		}

		public boolean isLoaded() {
			
			return Browser.BottomText().equals(bottomText);
		}

	}
