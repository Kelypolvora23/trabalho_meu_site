package empresa;

public class Dolar extends Moeda{

	public Dolar(double valor3) {
		this.valor = valor3;
	}
	@Override
	public void info() {
   	  System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 5.2;
				
		
	}

}