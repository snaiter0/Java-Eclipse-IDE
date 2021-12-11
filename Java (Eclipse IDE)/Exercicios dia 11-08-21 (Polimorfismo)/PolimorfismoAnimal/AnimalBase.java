package PolimorfismoAnimal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalBase extends Comunicacao implements PerfilAnimal 
{
	protected String Patas;
	protected String Calda;
	protected double Quilo;
	protected double altura;
	protected boolean Rosna;
	protected boolean MostraPresas;
	protected boolean EmiteSom;
	protected boolean Balan�aRabo;
	protected boolean Ecolocalizacao;
	
	public AnimalBase(String P,String C,double K,double A,boolean R,boolean M,boolean E,boolean B,boolean Ec)
	{
		super();
		Scanner leia = new Scanner(System.in);
		System.out.println("O animal possu� quantas Patas? ");
		this.setPatas(leia.nextLine());
		System.out.println("O animal pesa quantos quilos? ");
		this.setQuilo(leia.nextDouble());
		System.out.println("O animal possu� quanto de altura? ");
		this.setAltura(leia.nextDouble());
		System.err.println("Por favor, informe as informa��es a seguir com: true ou false");
		System.out.println("O animal Rosna? ");
		this.setRosna(leia.nextBoolean());
		System.out.println("O animal mostra as presas? ");
		this.setMostraPresas(leia.nextBoolean());
		System.out.println("O animal emite som? ");
		this.setEmiteSom(leia.nextBoolean());
		System.out.println("O animal balan�a o rabo?");
		this.setBalan�aRabo(leia.nextBoolean());
		System.out.println("O animal possui ecolocaliza��o? ");
		this.setEcolocalizacao(leia.nextBoolean());
		
		
	}

	public String getPatas() {
		return Patas;
	}

	public void setPatas(String patas) {
		Patas = patas;
	}

	public String getCalda() {
		return Calda;
	}

	public void setCalda(String calda) {
		Calda = calda;
	}

	public double getQuilo() {
		return Quilo;
	}

	public void setQuilo(double quilo) {
		Quilo = quilo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isRosna() {
		return Rosna;
	}

	public void setRosna(boolean rosna) {
		Rosna = rosna;
	}

	public boolean isMostraPresas() {
		return MostraPresas;
	}

	public void setMostraPresas(boolean mostraPresas) {
		MostraPresas = mostraPresas;
	}

	
	public boolean isEmiteSom() {
		return EmiteSom;
	}
	public void setEmiteSom(boolean EmiteSom) {
		this.EmiteSom = EmiteSom;
	}
	public boolean isBalan�aRabo() {
		return Balan�aRabo;
	}
	public void setBalan�aRabo(boolean balan�aRabo) {
		Balan�aRabo = balan�aRabo;
	}
	public boolean isEcolocalizacao() {
		return Ecolocalizacao;
	}
	public void setEcolocalizacao(boolean ecolocalizacao) {
		Ecolocalizacao = ecolocalizacao;
	}
	
	
	
	@Override
	public String Violento()
	{
		if(Rosna==true&&MostraPresas==true)
			{	
			return "SIM! Cuidado.";
			}else 
			{
				return "N�o.";
			}
			
	}

	@Override
	public String gordo() 
	{
		if(Quilo/altura>=1.2)
		{
		return "Sim! disciplina alimentar necess�ria.";
		}else
		{
			return "N�o, est� aceitavel.";
		}
	}

	@Override
	public String Cachorro() {
		if(Quilo>=25 && altura<=0.50 && Ecolocalizacao==false)
		{
			return "Provavelmente � um Cachorro";
		}else
		{
			return "Talvez n�o seja cachorro.";
		}
		
	}

	
}


	