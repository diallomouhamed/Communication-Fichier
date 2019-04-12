import java.io.*;

public class Serveur {
	private String fichier;

	public Serveur (String fichier) {
		this.fichier = fichier;
	}

	public void read () {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fichier)));
			String ligne;
			while ((ligne=reader.readLine()) != null){
				System.out.println(ligne);
			}
			reader.close(); 
		} catch (Exception e){
			System.out.println(e.toString());
		}
	}

	public void respond () {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fichier)));
			String ligne;
			String last = "";

			while ((ligne=reader.readLine()) != null){
				last = ligne;
			}

			reader.close();

			FileWriter writer = new FileWriter(fichier, true);

			if (last.equals("Bonjour")) {
				writer.write("Il fait jour.\n");
			} else if (last.equals("Bonsoir")) {
				writer.write("Il fait nuit.\n");
			} else {
				writer.write("Je n'ai pas compris.\n");
			}

			writer.close();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}