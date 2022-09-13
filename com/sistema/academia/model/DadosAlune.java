package com.sistema.academia.model;

public class DadosAlune {


	private String nome, cpf;
	private int genero, objetivo, senha, idade;
	private double peso, altura;
	
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getCpf() 
	{
		return cpf;
	}
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	public int getGenero() 
	{
		return genero;
	}
	public void setGenero(int genero) 
	{
		this.genero = genero;
	}
	public int getObjetivo() 
	{
		return objetivo;
	}
	public void setObjetivo(int objetivo) 
	{
		this.objetivo = objetivo;
	}
	public int getSenha() 
	{
		return senha;
	}
	public void setSenha(int senha)
	{
		this.senha = senha;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public double getPeso() 
	{
		return peso;
	}
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	public double getAltura() 
	{
		return altura;
	}
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	public void objetivoEscolhido()
	{
		
	}
	
}