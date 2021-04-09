package tcpServerTranslation;

public class TEST {

	public static void main(String[] args) {
		String text = "Good Morning bm";
		
		String text2 = text.substring(0,12);
		String text3 = text.substring(12,14);
		//Translator translate = new Translator (text);
		//translate.getTranslatedText();
		//System.out.println(translate.getTranslatedText());
		System.out.println(text2);
		System.out.println(text3);
	}

}
