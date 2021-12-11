package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio4_Dia_02_08_21 
{
	public static void main(String[] args) 
	{
		
		int A, B, C;
		float S,R,D;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nInsira os valores de A: ");
		A = leia.nextInt();
		System.out.println("\nInsira os valores de B: ");
		B = leia.nextInt();
		System.out.println("\nInsira os valores de C: ");
		C = leia.nextInt();
		
		R = (A+B);
		R = R*R;
		S = (B+C);
		S = S*S;
		
		D= (R+S)/2;
		
		

		System.out.println("\nO valor de R é de: "+ R);
		System.out.println("\nO valor de S é de: "+ S);
		System.out.println("\nO valor de D é de: "+ D);
		
		
		
		
		
	}
	
	
	
	
	
	
}
