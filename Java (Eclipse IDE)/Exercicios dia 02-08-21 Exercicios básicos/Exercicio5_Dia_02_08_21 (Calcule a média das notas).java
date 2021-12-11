package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio5_Dia_02_08_21 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		float mediatotal,nota1,nota2,nota3;
		
		System.out.println("\nInsira a nota 1: ");
		nota1=leia.nextInt();

		System.out.println("\nInsira a nota 2: ");
		nota2=leia.nextInt();

		System.out.println("\nInsira a nota 3: ");
		nota3=leia.nextInt();
		
		
		mediatotal = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\n A media total foi de: " + mediatotal);
		
		
		
		
	}

}
