package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio1_Dia_02_08_21 
{

	public static void main(String[] args) 
	{
		
		
		
		int anos = 0,meses = 0,dias = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira quantos anos você tem: ");
		anos = leia.nextInt();
		System.out.println("\nInsira quantos meses você tem: ");
		meses = leia.nextInt();
		System.out.println("\nInsira quantos dias você tem: ");
		dias = leia.nextInt();
		
		dias+=anos*365;
		dias+=meses*30;
		
		
		System.out.println("\nVocê possuí: "+ dias+" dias de vida.");
		
		
	}
	
	
}
