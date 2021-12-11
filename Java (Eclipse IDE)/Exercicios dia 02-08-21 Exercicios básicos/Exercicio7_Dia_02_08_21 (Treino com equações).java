package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio7_Dia_02_08_21 
{
public static void main(String[] args) 
{
	int a,b,c,d,e,f;
	float x,y;
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Insira o valor de A: ");
	a = leia.nextInt();
	System.out.println("Insira o valor de B: ");
	b = leia.nextInt();
	System.out.println("Insira o valor de C: ");
	c = leia.nextInt();
	System.out.println("Insira o valor de D: ");
	d = leia.nextInt();
	System.out.println("Insira o valor de E: ");
	e = leia.nextInt();
	System.out.println("Insira o valor de F: ");
	f = leia.nextInt();
	
	x= ((c*e)- (b*f)) / ((a*e)-(b*d));
	
	y= ((a*f)-(c*d)) / ((a*e)-(b*d));
	
	System.out.println("\nO valor de X é: "+x);
	System.out.println("\nO valor de Y é: "+y);
	
	
	
	
	
}
	
	
}
