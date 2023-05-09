package Aula4;

public class Principal {

	public static void main(String[] args) {
		
		//Pessoa p = new Pessoa(); não funciona classe abstrata não pode ser instanciada
		Aluno a = new Aluno();
		a.setNome("Diego");
		a.setAltura(1.84);
		System.out.println(a.toString());
		
		RadioRelogio r = new RadioRelogio();
		r.ajustar(20, 22, 56);
		

	}

}
