package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio3_Dia_02_08_21 
{

	public static void main(String[] args) 
	{
		int horas,minutos,segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira a quantidade total de segundos do processo: ");
		segundos=leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%60);
		
		
		System.out.println("O processo irá demorar "+horas +"horas, "+minutos+"minutos e "+segundos+"segundos. ");
		
		
		
		
		
	}
	
	
	
}
