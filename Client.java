import java.io.*;

public class Client {
	private String fichier;
	private String message;

	public Client (String fichier, String message) {
		this.fichier = fichier;
		this.message = message;
	}

	public void write () {
		try {
			FileWriter writer = new FileWriter(fichier, true);
			writer.write(message+"\n");
			writer.close();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}