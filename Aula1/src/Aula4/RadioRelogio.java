package Aula4;

public class RadioRelogio implements Relogio{

	@Override
	public void ajustar(int hora, int min, int seg) {
		
		System.out.println(hora+":"+min+":"+seg);
		
	}

}
