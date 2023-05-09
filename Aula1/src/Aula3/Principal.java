package Aula3;

public class Principal {

	public static void main(String[] args) {
		
		/*Imc i = new Imc();
		
		Pessoa p1 = new Pessoa(); //variavel de instancia p1 objeto, instancia da classe Pessoa.
		p1.altura = 1.84; //variável de instância
		p1.peso = 69;
		p1.sexo = "M";
		i.calcularImc(p1.peso, p1.altura);
		p1.imc = i;
		p1.diagnosticoH();
		
		Pessoa p2 = new Pessoa();
		p2.altura = 1.85;
		p2.peso = 85;
		p2.sexo = "F";
		i.calcularImc(p2.peso, p2.altura);
		p2.imc = i;
		p2.diagnosticoM();
		
		Pessoa p3 = new Pessoa();
		System.out.println("\n\nPessoa 3 - Altura:"+p3.altura);
		
		Pessoa p4 = new Pessoa(1.96,104,"F");
		System.out.println("\nPessoa 4:");
		p4.diagnosticoM();*/
		
		/*Pessoa p1 = new Pessoa(); 
		p1.setAltura (1.84);
		p1.setPeso (69);
		p1.setSexo ("M");
		p1.setImc();
		System.out.println("\nPeso:"+p1.getPeso());
		p1.diagnosticoH();
		*/
		
		
		Homem h1 = new Homem();
		h1.setPeso(70);
		h1.setAltura(1.84);
		h1.setSexo("H");
		h1.setImc();
		h1.diagnostico();
		
		
		
	}

}
