package PolimorfismoAnimal;

import java.util.InputMismatchException;

public class TestePoliAnimal
{
public static void main(String[] args) 
	{
	try {	
	AnimalBase Animal = new AnimalBase(null, null, 0, 0, false, false,false,false,false);
	PerfilAnimal perfil = Animal;
	System.out.println("O perfil do animal � violento? "+Animal.Violento());
	System.out.println("O animal � um cachorro? "+Animal.Cachorro());
	System.out.println("O animal est� a cima do peso? "+Animal.gordo());
	System.out.println("O animal emite som? "+Animal.isBalan�aRabo());
	} catch(InputMismatchException e)
	{
		System.err.println("Erro! reinicie o programa e insira a resposta positiva como 'true', e a negativa como 'false' quando solicitado.");
		
	}
	
	
	}

}
