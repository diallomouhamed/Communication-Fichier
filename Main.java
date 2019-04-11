import java.io.*;

public class Main {

	public static void main(String[] args) {
		String fichier = "data.txt";
		String message = "Hello World !";
		Serveur serveur = new Serveur(fichier);
		Client client1 = new Client(fichier, "Client 1 : "+message);
		Client client2 = new Client(fichier, "Client 2 : "+message);
		client1.write();
		client2.write();
		serveur.read();
	}
}