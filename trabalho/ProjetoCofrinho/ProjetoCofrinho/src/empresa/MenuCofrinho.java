package empresa;

import java.util.Scanner;

public class MenuCofrinho {
	private Scanner teclado;
	private Cofrinho cofrinho;

	public MenuCofrinho() {
	
		teclado = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenu() {	
		System.out.println("Cofrinho:");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover moeda:");
		System.out.println("3-Listar moedas:");
		System.out.println("4-Calcular total convertido para real:");
		System.out.println("0-Encerrar:");
		
		String Selecionar = teclado.next();
		
		
		switch (Selecionar){
		case "0":
			System.out.println("Finalizado");   
			break;

		case "1":
		    exibirMenuAdicionar();
            //exibirMenu();
        	break;
		case "2":  
		  //exibirMenuAdicionar();
          //exibirMenu();
			
			break;
		    case "3":
		    	cofrinho.listagemMoedas(); 		    	
		    	exibirMenu();
			break;
			
		    case "4":
		    	double valorTotalConvetido = cofrinho.totalConvertido();
		    	System.out.println("Valor Convertido:" + valorTotalConvetido);        
		    	exibirMenu();
			break;
			
        default:
            System.out.println("Inválido");
        	
        	break; 
		  }
	   }
	

	private void exibirMenuAdicionar() {
		
		System.out.println("Escolha a Moeda");
		System.out.println("1- Real");
	    System.out.println("2- Dolar");
		System.out.println("3- Euro");
		
	    int opcao = teclado.nextInt();
	    

		System.out.println("Digite o valor: " + opcao);
		
		String moedaString = teclado.next();	
		
        moedaString = moedaString.replace(",",".");
        double valorMoeda = Double.parseDouble(moedaString);
        
        Moeda moeda = null;
        
    	if (opcao == 1) {
    		 moeda = new Real(valorMoeda);
        } else if(opcao == 2) {
    		 moeda = new Dolar(valorMoeda);     		
    	} else if (opcao == 3) {
    		 moeda = new Euro(valorMoeda);    		
    	} else {
    		System.out.println("Moeda não existe");
    		exibirMenu();
    	}
    	
    	cofrinho.adicionar(moeda);
    	System.out.println("Moeda adicionada   "  );	
    	exibirMenu();  	
	}
    	
    	
    	private void exibirMenuRemover() {
    		
    		System.out.println("Escolha a Moeda");
    		System.out.println("1- Real");
    	    System.out.println("2- Dolar");
    		System.out.println("3- Euro");
    		
    	    int opcao = teclado.nextInt();
    	
    	    System.out.println("Digite o valor: " );
    		
    		String moedaString = teclado.next();	
    		
            moedaString = moedaString.replace(",",".");
            double valorMoeda = Double.parseDouble(moedaString);
            
            Moeda moeda = null;
            
        	if (opcao == 1) {
        		 moeda = new Real(valorMoeda);
            } else if(opcao == 2) {
        		 moeda = new Dolar(valorMoeda);     		
        	} else if (opcao == 3) {
        		 moeda = new Euro(valorMoeda);    		
        	} else {
        		System.out.println("Moeda não existe");
        		exibirMenu();
        	}
        	
        	cofrinho.remover(moeda);
        	System.out.println("Moeda removida   "  );	
    	    	
    	//cofrinho.remover(moeda);   	
		
		
	}
	
	
}



