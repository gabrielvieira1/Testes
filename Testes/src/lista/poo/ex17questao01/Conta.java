package lista.poo.ex17questao01;



public class Conta {
	private int conta;
	public int contaArray[] = {10, 20, 30, 40, 50};
	

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	public void verifica() throws ExcecaoCadastroCheio {
		ExcecaoCadastroCheio exe = new ExcecaoCadastroCheio();
		
		for(int i = 0; i < contaArray.length; i++){
		      if (contaArray[i] != 0){
		    	  System.out.println("Entrou");
		          throw exe;
		     }
		}
	}
	
	public void adicionar (int conta) throws ExcecaoCadastroCheio{

		verifica();
	     for(int i =0; i < contaArray.length; i++){
	        if(contaArray[i] == 0){
	        	contaArray[i] = conta;
	        	break;
	     }
	     
	}
	}
	
	public void verificarContaExistente (int valor) throws ExcecaoContaJaExistente {

	    ExcecaoContaJaExistente excecaoContaJaExistente = new ExcecaoContaJaExistente();

	    for(int i = 0; i < contaArray.length; i++){

	        if(contaArray[i] == valor)
	        	System.out.println("entrou");
	            throw excecaoContaJaExistente;
	        }
	    }
	
	public void verificarContaInexistente (int valor) throws ExcecaoContaInexistente {

		ExcecaoContaInexistente excecaoContaInexistente = new ExcecaoContaInexistente();

	    for(int i = 0; i < contaArray.length; i++){

	        if(contaArray[i] != valor)
	        	System.out.println("entrou");
	            throw excecaoContaInexistente;
	        }
	    }


}
