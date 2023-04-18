package Aula3;

public class Principal {

	public static void main(String[] args) {
		Imc i = new Imc();//Cria um objeto para o Imc
		Pessoa juli = new Pessoa();//Objeto é uma instância de uma classe
		
		//Variaveis de Instancia:
		juli.altura = 1.78;
		juli.peso = 109;
		juli.sexo = "M";
		i.calcularImc(juli.peso, juli.altura);//calculo do imc para juli: Objeto i recebe o método calcularImc() e passa os parametros do juli
		juli.imc = i;
		juli.diagnosticoH();//Metodos de instancia
		
		Pessoa diego = new Pessoa();
		diego.altura = 1.84;
		diego.peso = 69;
		diego.sexo = "M";
		i.calcularImc(diego.peso, diego.altura);
		diego.imc = i;
		diego.diagnosticoH();
		
		Pessoa maria = new Pessoa();
		maria.altura = 1.85;
		maria.peso = 85;
		maria.sexo = "F";
		i.calcularImc(maria.peso, maria.altura);
		maria.imc = i;
		maria.diagnosticoM();
	}

}
