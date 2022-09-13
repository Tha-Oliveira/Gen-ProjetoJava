package com.sistema.academia.model;

import java.util.Scanner;

public class Calculos extends DadosAlune {
	
	double tmb = 0;
	Scanner leia = new Scanner(System.in);
	
	public void verificarIdade() 
	{
		do 
		{
			System.out.println("\nEntre com sua Idade: ");
			setIdade(leia.nextInt());

			if (getIdade() < 18) 
			{
				System.out.println("Você é menor de idade, não pode acessar o programa!");
			}
		} 
		while (getIdade() < 18);
	}

	public void CalculoIMC() 
	{
		double imc = getPeso() / (Math.pow(getAltura(), 2));

		System.out.printf("\nO resultado do IMC foi de: %.2f %%", imc);
		if (imc < 18.5) 
		{
			System.out.println("\nVocê está abaixo do peso!");
		}
		else if (imc >= 18.6 && imc <= 24.99) {
			System.out.println("\nVocê está com peso normal!");
		} 
		else
			System.out.println("\nVocê está acima do peso!");
		
		ObjetivoFinal();
	}
	
	public void ObjetivoFinal() 
	{
		
		if (getGenero() == 1) 
		{
			if (getIdade() >= 18 && getIdade() <= 30) 
			{
				tmb = (getPeso() * 14.818) + 486.6;
			}
			if (getIdade() >= 31 && getIdade() <= 60) 
			{
				tmb = (getPeso() * 8.126) + 845.6;
			}
			System.out.printf("\nO resultado da Taxa Metabólica é de: %.0f calorias por dia!", tmb);
		}
		else if (getGenero() == 2) 
		{
			if (getIdade() >= 18 && getIdade() <= 30) 
			{
				tmb = (getPeso() * 15.057) + 692.2;
			}
			if (getIdade() >= 31 && getIdade() <= 60) 
			{
				tmb = (getPeso() * 11.472) + 873.1;
			}
			System.out.printf("\nO resultado da Taxa Metabólica é de: %.0f calorias por dia!\n", tmb);
		}
		objetivoEscolhido();
	}
	
	public double getTmb()
	{
		return tmb;
	}

	public void setTmb(double tmb) 
	{
		this.tmb = tmb;
	}
	
}

	

