package PolimorfismoAnimal;

import java.util.Scanner;

public class Comunicacao 
{
	protected boolean emiteSom;
	protected static boolean Balan�aRabo;
	protected boolean Ecolocalizacao;
	Scanner leia = new Scanner(System.in);
	
	
	
	
	public boolean isEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		emiteSom = true;
		this.emiteSom = emiteSom;
	}
	public boolean isBalan�aRabo() {
		return Balan�aRabo;
	}
	public void setBalan�aRabo(boolean balan�aRabo) {
		Balan�aRabo = emiteSom;
	}
	public boolean isEcolocalizacao() {
		return Ecolocalizacao;
	}
	public void setEcolocalizacao(boolean ecolocalizacao) {
		Ecolocalizacao = emiteSom;
	}
	
	
	
	
}
