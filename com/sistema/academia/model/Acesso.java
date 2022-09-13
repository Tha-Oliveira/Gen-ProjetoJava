package com.sistema.academia.model;

import java.util.Scanner;

public class Acesso extends Objetivo {

	private String login;
	private int senhaAlune;
	
	Scanner leia = new Scanner(System.in);

	public String getLogin() 
	{
		return login;
	}

	public void setLogin(String login) 
	{
		this.login = login;
	}

	public int getSenhaAlune()
	{
		return senhaAlune;
	}

	public void setSenhaAlune(int senhaAlune)
	{
		this.senhaAlune = senhaAlune;
	}
	

	public void primeiroAcesso() 
	{
		System.out.println("Entre com seu nome: ");
		setNome(leia.next());
		System.out.println("Entre com seu Gênero: (1)Feminino (2)Masculino (3)Não binário");
		setGenero(leia.nextInt());
		verificarIdade();
		System.out.println("Entre com seu peso: ");
		setPeso(leia.nextDouble());
		System.out.println("Entre com sua altura: ");
		setAltura(leia.nextDouble());
		System.out.println("Entre com seu Login (CPF)");
		setLogin(leia.next());
		System.out.println("Entre com sua senha: ");
		setSenhaAlune(leia.nextInt());
		System.out.println("\nCadastro realizado com sucesso!");

		loginNovo();
	}

	public void loginNovo() 
	{
		int x;
		String y;

		System.out.println("\nEntre com seu Login (CPF): ");
		y = leia.next();
		System.out.println("\nEntre com a sua senha: ");
		x = leia.nextInt();

		if (this.login.equals(y) && this.senhaAlune == x) 
		{
			loginAluneCadastrado();
		} 
		else
		{
			System.out.println("\nLogin ou senha incorretos.");
			loginNovo();
		}
	}
	
	public void loginAlune()
	{
		int x;
		String y;

		System.out.println("\nEntre com seu Login (CPF): ");
		y = leia.next();
		System.out.println("\nEntre com a sua senha: ");
		x = leia.nextInt();

		if (getCpf().equals(y) && getSenha() == x) 
		{
			loginAluneCadastrado();
		} 
		else
		{
			System.out.println("\nLogin ou senha incorretos.");
			loginAlune();
	}
	}

	public void aluneCadastrado() 
	{
		int op = 0;

		System.out.println("\nDigite 1 para: Amanda Giacometti");
		System.out.println("Digite 2 para: Gustavo Macedo");
		System.out.println("Digite 3 para: Sandy Martins");
		System.out.println("Digite 4 para: Thais Melim");
		System.out.println("Digite 5 para: Thais Oliveira");
		op = leia.nextInt();

		switch (op) 
		{
		case 1:
			setNome("Amanda Giacometti");
			setIdade(27);
			setGenero(1);
			setPeso(65f);
			setAltura(1.60f);
			setCpf("123");
			setSenha(1234);
			loginAlune();
			break;
			
		case 2:
			setNome("Gustavo Macedo");
			setIdade(29);
			setGenero(2);
			setPeso(80f);
			setAltura(1.80f);
			setCpf("123");
			setSenha(1234);
			loginAlune();
			break;
			
		case 3:
			setNome("Sandy Martins");
			setIdade(26);
			setGenero(1);
			setPeso(65f);
			setAltura(1.60f);
			setCpf("123");
			setSenha(1234);
			loginAlune();
			break;
			
		case 4:
			setNome("Thais Melim");
			setIdade(31);
			setGenero(1);
			setPeso(65f);
			setAltura(1.58f);
			setCpf("123");
			setSenha(1234);
			loginAlune();
			break;
			
		case 5:
			setNome("Thais Oliveira");
			setIdade(27);
			setGenero(1);
			setPeso(65f);
			setAltura(1.63f);
			setCpf("123");
			setSenha(1234);
			loginAlune();
			break;
		}
	}

	public void loginAluneCadastrado() 
	{
		CalculoIMC();
	}

}