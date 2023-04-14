package Lista_2;

public class Variaveis {
		
	//Declarando as variáveis Programa6
		int vinicial;
        int vfinal;
        int contador;
        int entrada;
        String metodo;
        int x = 0, y = 0, confere = 0;
        int N = 0;
    //Declarando as variáveis Programa7    

void medotoWhile() {
    System.out.println("Calculo usando "+metodo+": ");
		while (contador <= 14) {
		vfinal = vfinal + vinicial;
		vinicial++;
		contador++;
		}
    System.out.println("A soma de 1 até 15 é: "+vfinal+"\n");
    }
void metodoDoWhile() {
    do {
        
        vfinal = vfinal + vinicial;
        vinicial++;
        contador++;	
    }
    while(contador < 15);
    System.out.println("Calculo usando "+metodo+": ");
    System.out.println("A soma de 1 até 15 é: "+vfinal+"\n");	
    
}
void metodoFor(){
    System.out.println("Calculo usando "+metodo+": ");
    for(contador = 1; contador < 15; contador++){
        vfinal = vfinal + vinicial;
		vinicial++;
    }
    System.out.println("A soma de 1 até 15 é: "+vfinal); 
}

}