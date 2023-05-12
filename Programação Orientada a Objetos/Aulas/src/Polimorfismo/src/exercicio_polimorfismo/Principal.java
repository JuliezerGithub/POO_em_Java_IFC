package exercicio_polimorfismo;

public class Principal {
	public static void main(String[] args) {
		// Teste da classe Relogio
		Relogio relogio = new Relogio(10, 30, 0);
		System.out.println(relogio.toString()); // 10:30:00
		relogio.incrementaSeg();
		System.out.println(relogio.toString()); // 10:30:01
		relogio.decrementaMin();
		System.out.println(relogio.toString()); // 10:29:01
		System.out.println("\nO horário Ajustado é: ");
		relogio.ajustaHora(12, 15, 59);
		System.out.println(relogio.toString()); // 12:00:00

		// Teste da classe Cronometro
		System.out.println("\nCronometro: ");
		Cronometro cronometro = new Cronometro();
		System.out.println(cronometro.toString()); // 00:00:00.00
		cronometro.incrementaCent();
		System.out.println(cronometro.toString()); // 00:00:00.01
		cronometro.incrementaSeg();
		System.out.println(cronometro.toString()); // 00:00:01.00
		cronometro.incrementaMin();
		System.out.println(cronometro.toString()); // 00:01:00.00

		// Teste da classe Despertador
		System.out.println("\nDespertador: ");
		Despertador despertador = new Despertador(8, 0, 0, 8, 30);
		System.out.println(despertador.toString()); // 08:00:00
		despertador.incrementaHora(); // 09:00:00
		System.out.println(despertador.toString()); // 09:00:00
		despertador.setHorarioAlarme(9, 30);
		despertador.ativarDespertador();
		for (int i = 0; i < 31 * 60; i++) { // Espera 31 minutos
			despertador.incrementaSeg();
			if (despertador.toString().equals("09:30:00")) {
				System.out.println("Alarme ativado!");
				break;
			}
		}
	}
}

