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
			notas.todasNotas(80.50, 78.50, 85.20, 74.30);
			System.out.printf("Sua primeira nota = %.2f \n ", notas.nota1);
			System.out.printf("Sua segunda nota = %.2f \n ", notas.nota2);
			System.out.printf("Sua terceira nota = %.2f \n", notas.nota3);
			System.out.printf("Sua quarta nota = %.2f \n", notas.nota4);
		
			double notasPrimeiroBi = notas.nota1 + notas.nota2;
			double notasSegundoBi = notas.nota3 + notas.nota4;
			double media = ((notasPrimeiroBi + notasSegundoBi) / 4);
		
			System.out.printf("Sua média semestral é: %.2f ", media);
		
			
	
			
			
			

			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
