package tcpClientTranslation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class ClientTranslationApplication {

	public static void main(String[] args) {
					
		try {
			
			//Connect to the server at localhost, port 4228
			Socket socket = new Socket(InetAddress.getLocalHost(),4228);
			
			//Create input object
			Scanner sc = new Scanner(System.in);
			
			//Create Input stream
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			//Print message to show client side
			System.out.println("Client side");
			
			//Prompt user to input text
			System.out.println("Enter Message");
			String text =(sc.nextLine());
			
			//Prompt user to select language
			System.out.println("Select language: ");
			System.out.println("Type 1 for Bahasa Malaysia");
			System.out.println("Type 2 for Arabic");
			System.out.println("Type 3 for Korean");
			int language = sc.nextInt();
			
			//send data to the server	
			outputStream.writeUTF(text);
			outputStream.writeInt(language);
			outputStream.flush();
		
			//Create stream to read data sent from server
			DataInputStream dataIn = new DataInputStream(socket.getInputStream());
			
			//assign object to read data from server
			String translatedText = dataIn.readUTF();
		
			//print the translated text sent from server
			System.out.println("The translated text: " + translatedText );
		
 			//Close everything
			outputStream.close();
			sc.close();
			socket.close();
			dataIn.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
