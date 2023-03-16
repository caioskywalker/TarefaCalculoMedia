package Boletim;

/**
 * 
 * @author caiof
 * Setar os valores das notas
 * Impressão de notas
 * Operacoes de soma e divisão para encontrar as médias
 * Impressão da média
 * 
 *
 */

public class Operacoes {
	
		
	public static void main(String[] args) {
	
			Notas notas = new Notas();
			notas.todasNotas(80, 78, 85, 74);
			System.out.printf("Sua primeira nota = %d \n", notas.nota1);
			System.out.printf("Sua segunda nota = %d \n", notas.nota2);
			System.out.printf("Sua terceira nota = %d \n", notas.nota3);
			System.out.printf("Sua quarta nota = %d \n", notas.nota4);
		
		int notasPrimeiroBi = notas.nota1 + notas.nota2;
		int notasSegundoBi = notas.nota3 + notas.nota4;
		int media = ((notasPrimeiroBi + notasSegundoBi) / 4);
		System.out.printf("Sua média semestral é: %d ", media);
		
			
	
			
			
			

			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
