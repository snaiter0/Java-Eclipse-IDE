package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio6_Dia_02_08_21 
{
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		float x1,x2,y1,y2,d;
		
		
		System.out.println("\nInsira o valor de X1");
		x1 = leia.nextInt();
		System.out.println("\nInsira o valor de X2");
		x2 = leia.nextInt();
		System.out.println("\nInsira o valor de Y1");
		y1 = leia.nextInt();
		System.out.println("\nInsira o valor de Y2");
		y2 = leia.nextInt();
		
		
		d=(float) (Math.sqrt(Math.pow((x1+x2),2.0)+(Math.pow(y1+y2, 2.0))));
		
		System.out.printf("\nA distancia entre os dois pontos é de: %2.2f", d);
		
	}

}
