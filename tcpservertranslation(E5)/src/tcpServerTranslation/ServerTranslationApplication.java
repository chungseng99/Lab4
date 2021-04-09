package tcpServerTranslation;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTranslationApplication {

	
	public static void main(String[] args) throws Exception {
		
		
		ServerSocket serverSocket = null;
		
		try {
				    
			
			//Bind Serversocket to a port
			int portNo = 4228;
			serverSocket = new ServerSocket(portNo);
			
			System.out.println("Server Side");
			System.out.println("Waiting for request...");
			
			
			
			while(true) {
				
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Create stream to read data from client
				DataInputStream dataIn = new DataInputStream(clientSocket.getInputStream());
				
				//create new object for translator
				Translator message = new Translator();
				
				//assign text read from client
				 message.setText(dataIn.readUTF()); 
				 
				//assign language read from client 
				 message.setLanguage(dataIn.readInt()); 
				 
				 //Object to store text
				 String text = message.getText();
				 
				 //Object to store language
				 int language= message.getLanguage();
				 
				 //Translate the text 
				Translator textToTranslate = new Translator(text,language);
				
				//Create stream to write data to the network
				DataOutputStream dataOut = new DataOutputStream(clientSocket.getOutputStream());
				
				//Send data to the client
				dataOut.writeUTF(textToTranslate.getTranslatedText());
				dataOut.flush();
								
				//close the socket
				clientSocket.close();
				dataIn.close();
				dataOut.close();
			
			}
			
			
		}catch(IOException ioe) {
			
			if(serverSocket != null)
				serverSocket.close();
			
			ioe.printStackTrace();
			
		}

	}

}