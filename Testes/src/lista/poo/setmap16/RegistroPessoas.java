package lista.poo.setmap16;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class RegistroPessoas implements Serializable{
	//ArrayList<String> listaArray;
	Map<Object, String> listaMap;
	int cont = 0;
	
	
	public RegistroPessoas() {
	//	listaArray = new ArrayList<>(); 
		listaMap = new HashMap<Object, String>(); 
	}
	
	public void assinar(String nomeCompleto) {
	//	listaArray.add(nomeCompleto);
		listaMap.put(cont, nomeCompleto);
		cont++;
	}
//	public ArrayList assinaturas() {
//		return listaArray;
//	}
	
	public void assinaturas(){
		for(Map.Entry<Object, String> enty : listaMap.entrySet()) {
			System.out.println("Nomes: " + enty.getValue());
		}
		return;
	}
	
//	public ArrayList getTotal() {
//		return listaArray;
//	}
	
	public Map<Object, String> getTotal() {
		return listaMap;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "nomes: " + listaMap.entrySet();
	}

}
