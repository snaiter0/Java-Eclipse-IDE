package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio8_Dia_02_08_21 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		float CarroFinal=0,custo,imposto=(float) 0.28,distribuidor=(float) 0.45;
		
		System.out.println("\nInsira o custo base do carro");
		custo = leia.nextInt();
		
		
		CarroFinal += ((distribuidor+imposto)*custo+custo);
		
		System.out.println("\nO valor total do carro é de: "+ CarroFinal);
		
		
		
		
	}
	
	
}
