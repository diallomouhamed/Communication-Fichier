import java.io.*;

public class Main {

	public static void main(String[] args) {
		String fichier = "data.txt";
		String message1 = "Bonjour";
		String message2 = "Bonsoir";
		Serveur serveur = new Serveur(fichier);
		Client client1 = new Client(fichier, message1);
		Client client2 = new Client(fichier, message2);
		client1.write();
		serveur.respond();
		client2.write();
		serveur.respond();
		serveur.read();
	}
}