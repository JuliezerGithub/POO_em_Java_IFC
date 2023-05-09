package Exemploaula3;

import Aula3.Imc;

public class Calculadora {
	
	public static double numero1;
	
	public static double numero2;
	
	public static double somar;
	
	public static double subtrair;
	
	public static double multiplicar;
	
	public static double dividir;
	
	public static double valor1;
	
	public static double valor2;
	
	public static double valor3;
	
	public static double valor4;
	
	Calculadora() {//método construtor mesmo nome da classe
		this.numero1 = 1;
		this.numero2 = 2;
	}
	
	Calculadora(double numero1, double numero2)
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
		calcularSomar(numero1, numero2);
		this.somar = valor1;
		calcularSubtrair(numero1, numero2);
		this.subtrair = valor2;
		Multiplicar i = new Multiplicar();
		i.calcularMultiplicar(numero1, numero2);
		this.multiplicar = i;
		Dividir i = new Dividir();
		i.calcularDividir(numero1, numero2);
		this.dividir = i;
	}

	static void calcularSomar(double numero1, double numero2)
	{
		this.valor1 = numero1 + numero2;
		System.out.println(this.valor);
	}
	
	static void calcularSubtrair(double numero1, double numero2)
	{
		this.valor2 = numero1 - numero2;
		System.out.println(this.valor);
	}
	
	static void calcularMultiplicar(double numero1, double numero2)
	{
		this.valor3 = numero1 * numero2;
		System.out.println(this.valor);
	}
	
	static void calcularDividir(double numero1, double numero2)
	{
		this.valor4 = numero1 / numero2;
		System.out.println(this.valor);
	}
	
}
