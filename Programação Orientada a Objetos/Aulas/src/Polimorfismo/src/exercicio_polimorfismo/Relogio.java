package exercicio_polimorfismo;
/*1 –O que fazer:
Crie uma classe Relogio para armazenar a hora, minuto e segundo.

Que disponibilize métodos:
- incrementar os segundos										  	   **OK**
- decrementar os segundos 											   **OK**
- Ajustar o horário													   **OK**
- Retornar uma String com o horário atual.							   **OK**

Obs: 
- Deixe os atributos como protected e os métodos como public.		   **OK** 
- Crie um construtor sem parâmetros que inicialize a hora em 00:00:00. **OK** 
- E um outro construtor que receba a hora, minuto e segundo iniciais.  **OK** 

*/
public class Relogio {
	
	//Atributos:
	protected int hora, min, seg;
	
	public Relogio() {//Construtor sem parametros
		super();
		this.hora = 00;
		this.min = 00;
		this.seg = 00;
	}
	public Relogio(int hora, int min, int seg) {//Construtor com parametros hora, min, seg
		super();
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	//Getters e Setters para ajustar a hora, min, seg:
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}

	public void incrementaSeg() {
		seg++;
		if (seg >= 60) {
			seg = 0;
			min++;
			incrementaMin();
		}
	}
	
	public void decrementaSeg() {
		seg--;
		if (seg < 00) {
			seg = 59;
			min--;
			decrementaMin();
		}
	}
	public void incrementaMin() {
        min++;
        if (min >= 60) {
            min = 00;
            incrementaHora();
        }
    }

    public void incrementaHora() {
		hora++;
		if(hora >= 24) {
			hora = 00;
		}
		
	}
	public void decrementaMin() {
        min--;
        if (min < 00) {
            min = 59;
            decrementaHora();
        }
    }
	
	private void decrementaHora() {
		hora--;
		if(hora < 00) {
			hora = 24;
		}		
	}
	public void ajustaHora(int hora, int min, int seg) {
		
		this.hora = hora;
		this.min = min;
		this.seg = seg;
		
	}

	public String toString() {//Retorna uma String com o Horário Atual
		
		return String.format ("%02d:%02d:%02d", hora, min, seg);
	}
}
