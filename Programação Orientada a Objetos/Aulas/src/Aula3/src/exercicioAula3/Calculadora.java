package exercicioAula3;

import java.util.Scanner;

public class Calculadora {
/***************************************/
	//Atributos
	
	static double numero1 = 0;
	static double numero2 = 0;
/***************************************/	
	//metodos

	public static double somar;
	public static double subtrair;
	public static double multiplicar;
	public static double dividir;

	public Calculadora() {
		double numero1 = 0;
		double numero2 = 0;

		lerNumeros(numero1, numero2);
		Calculadora.somar = numero1 + numero2;
		Calculadora.subtrair = numero1 - numero2;
		Calculadora.multiplicar = numero1 * numero2;
		Calculadora.dividir = numero1 / numero2;
	}


	public static void lerNumeros(double numero1, double numero2) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digire o primeiro valor: ");
			numero1 = sc.nextDouble();
			System.out.println("Digire o segundo valor: ");
			numero2 = sc.nextDouble();
		}
		System.out.println("Soma dos valores: "+somar);
		
	}

	}
