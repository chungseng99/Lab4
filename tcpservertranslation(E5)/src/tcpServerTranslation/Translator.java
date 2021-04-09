package tcpServerTranslation;

public class Translator {

	private String text;
	private int language;
	
	
	public Translator(String text,int language) {
		
		this.text=text;
		this.language=language;
		
		
	}
	
	public Translator() {
		
		
		
	}
	
	public void setText(String text) {
		
		this.text=text;
		
	}
	
	public String getText() {
		
		return text;
		
	}
	
	public void setLanguage(int language) {
		
		this.language=language;
		
		
	}
	
	
	public int getLanguage() {
		
		return language;
	}
	
	
	
	
	public String getTranslatedText() {
		
		String translatedText = "";
				
		if(text.contentEquals("Good Morning")||text.contentEquals("Good morning")||text.contentEquals("good morning")) {
			
			if(language==1) {
				
				translatedText="Selamat Pagi";
				
			}else if(language==2){
				
				translatedText="صباح الخير";
				
			}else if(language==3){
			
				translatedText="좋은 아침";
				
			}
			
			
		}else if (text.contentEquals("Good Night")||text.contentEquals("Good night")||text.contentEquals("good night")) {
			
			if(language==1) {
				
				translatedText="Selamat malam";
				
			}else if(language==2){
				
				translatedText="مساء الخير";
				
			}else if(language==3){
			
				translatedText="안녕히 주무세요";
				
			}
			
		}else if (text.contentEquals("How are you?")||text.contentEquals("how are you?")) {
			
			if(language==1) {
				
				translatedText="Apa khabar?";
				
			}else if(language==2){
				
				translatedText="كيف حالكم؟";
				
			}else if(language==3){
			
				translatedText="어떻게 지내세요?";
				
			}
		
		}else if (text.contentEquals("Thank you")||text.contentEquals("thank you")) {
			
			if(language==1) {
				
				translatedText="Terima kasih";
				
			}else if(language==2){
				
				translatedText="شكرا جزيلا";
				
			}else if(language==3){
			
				translatedText="감사합니다";
				
			}
		
		}else if (text.contentEquals("Goodbye")||text.contentEquals("goodbye")) {
			
			if(language==1){
				
				translatedText="Selamat Tinggal";
				
			}else if(language==2){
				
				translatedText="مع السلامة";
				
			}else if(language==3){
			
				translatedText="안녕";
				
			}
			
		}else if (text.contentEquals("What's up?")||text.contentEquals("what's up?")) {
			
			if(language==1) {
				
				translatedText="Ada apa?";
				
			}else if(language==2){
				
				translatedText="ما أخبارك؟";
				
			}else if(language==3){
			
				translatedText="뭐야?";
				
			}
		
		
		
	}
		return translatedText;
	
	
	}

	
	
	
	}

