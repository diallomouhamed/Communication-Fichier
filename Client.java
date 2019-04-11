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
			PrintWriter writer = new PrintWriter(new File(fichier));
			writer.println(message);
			writer.close();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}