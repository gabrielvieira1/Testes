package lista.poo.setmap16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.HashMap;

public class Arquivo<T> {
	T objet;
	
	File arquivoAssinaturas = new File("assinaturas.txt");
	Map<Object, String> objeto = new HashMap<Object, String>();
	
	public Arquivo(T objet) {
		this.objet = objet;
	}
	public String gravarLista(Map<Object, String> obj) throws IOException  {
		FileOutputStream fos;
		int cont = 0;
			if (!arquivoAssinaturas.exists()) {
				arquivoAssinaturas.createNewFile();
			}

				fos = new FileOutputStream(arquivoAssinaturas);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(obj);
				oos.close();
			return "Gravado com sucesso";
			
	}
	public Map<Object, String> retornaLista() throws ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream(arquivoAssinaturas);
		ObjectInputStream ois = new ObjectInputStream(fis);
		objeto = (Map<Object, String>) ois.readObject();
		
		return objeto;
	}

}
