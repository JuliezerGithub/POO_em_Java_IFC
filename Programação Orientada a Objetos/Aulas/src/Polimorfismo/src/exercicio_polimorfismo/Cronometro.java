package exercicio_polimorfismo;
/*2 – O que fazer:
- Crie uma classe Cronômetro a partir de uma herança da classe Relogio
- Onde também serão armazenados os centésimos de segundo. 
- A classe deve redefinir os métodos para incrementar 
- A classe deve redefinir os métodos para decrementar
- E o método para retornar uma String da hora atual juntamente com os centésimos.
*/
public class Cronometro extends Relogio {
	
	protected int cent;
	public Cronometro() {//Construtor sem parametros
		super();
		this.cent = 00;
	}
	public Cronometro(int hora, int min, int seg, int cent) {//Construtor com parametros hora, min, seg
		super(hora, min, seg);
		this.cent = cent;
	}
	public int getCent() {
		return cent;
	}
	public void setCent(int cent) {
		this.cent = cent;
	}
	public void incrementaCent() {
		if (cent >= 100) {
			cent = 0;
			incrementaSeg();
		}
	}
	
	public void decrementaCent() {
		if (cent < 0) {
			cent = 99;
			decrementaSeg();
		}
	}

	@Override
	public String toString() {//Retorna uma String com o Horário Atual incluindo os centésimos
		
		return String.format ("%02d:%02d:%02d.%02d", hora, min, seg, cent);
	}
}