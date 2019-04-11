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
}