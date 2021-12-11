package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio2_Dia_02_08_21 
{
	
	public static void main(String[] args) 
	{
		
		int dias, meses=0, anos=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira quantos dias de vida você possuí: ");
		dias = leia.nextInt();
		
		
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		 
		
		
		
		
		System.out.println("Você possuí "+ anos + " anos " + meses + " meses, " + dias + " dias de vida");
		
		
		
		
	}

}
