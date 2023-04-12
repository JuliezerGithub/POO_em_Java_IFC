package Lista_2;

public class ArrayList {
	// Disponível em: https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530
	
	//1. Declarando um Array
    void DeclaracaoArray(){
        //[] - são inseridos em uma variável que referecia um array
        @SuppressWarnings("unused")
		int[] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        @SuppressWarnings("unused")
		int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        @SuppressWarnings("unused")
		int[] r = new int[44], k = new int[23];

//{} - inicializar valores em um array sua declaração
        @SuppressWarnings("unused")
		int[] iniciaValores = {12,32,54,6,8,89,64,64,6};

//DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;
        
        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];
        
        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
        
    }
    //2. Verificando o Tamanho de um Array
    void TamanhoArray() {    
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if(arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
    }
    //3. Inicialização de um Array SEM VALORES
    void InicializacaoSemValor() { 
    	   //ARRAY COM 10 ELEMENTOS 
    	   int[] arrayBase; 
    	   arrayBase = new int[ 20 ]; 
    	   System.out.printf("%s %10s \n", "Index", "Valores"); 
    	   //GERA A SAÍDA DO VALOR DE CADA ELEMENTO DO ARRAY 
    	   for(int i = 0; i < arrayBase.length; i++) 
    	    System.out.printf("%3d %10d \n", i, arrayBase[ i ]); 
    	   }
    //4. Inicialização de um Array COM VALORES
    void InicializacaoComValor(){ 
    	//LISTA  DE VALORES
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};   
        System.out.printf("%s %12s \n", "Index", "Valores");    
        //PERCORRE CADA ELEMENTO E IMPRIME O ÍNDICE COM O VALOR
        for( int counter = 0; counter < array.length; counter ++){       
            System.out.printf("%5d %4s %4d \n", counter, "=>" , array[ counter ]);
        }
    }
    //5. Percorre o Array com o For Aprimorado
    void ForAprimorado() {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;  
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);
    }
    //6. Arrays Multidimensionais
	void ArrayMultidimensional(){
        
        int[][] array1 = { { 1,2,3 }, { 4, 5, 6 } };
        int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6} };
        
        System.out.println("Valores no array1 passados na linha são");
        outputArray( array1 ); //exibe o array 2 por linha
        
        System.out.println("Valores no array2 passados na linha são");
        outputArray( array2 ); //exibe o array 2 por linha
            
        }
    //FAZ UM LOOP PELAS LINHAS DO ARRAY
	void outputArray(int[][] array)
    {
        //FAZ UM LOOP PELAS COLUNAS DA LINHA ATUAL
        for(int linha = 0; linha < array.length; linha++)
        {
            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( int coluna = 0; coluna < array[linha].length; coluna++)
                System.out.printf("%d ", array[linha][coluna]);     
            System.out.println();
        }
    }
}
