package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	 ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas () {
		
		if(this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho");
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		  if (this.listaMoedas.isEmpty()) {
			  return 0;
		  }
	    double V_acumula = 0;
	    
	    for (Moeda moeda : this.listaMoedas) {
	    	V_acumula = V_acumula + moeda.converter();
	    }
	    
	    return V_acumula;
    }
	
}
