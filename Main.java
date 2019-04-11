import java.io.*;

public class Main {

	public static void main(String[] args) {
		String fichier = "hello.txt";
		Serveur serveur = new Serveur(fichier);
		Client client = new Client(fichier, "Hello World !");
		client.write();
		serveur.read();
	}
}