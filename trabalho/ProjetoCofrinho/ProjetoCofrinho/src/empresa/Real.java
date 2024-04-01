package empresa;

public class Real extends Moeda{

	public Real(double valor1) {
		this.valor = valor1;
	}
	public double converter () {
		return this.valor;
	}
	@Override
	public boolean equals(Object objeto) {	
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoReal = (Real) objeto;
		
		if (this.valor != objetoReal.valor) {
			return false;
					
		}
		
		return true;
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

}
