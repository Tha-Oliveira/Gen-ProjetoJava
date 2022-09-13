package com.sistema.academia.model;

import java.util.Scanner;

public class Objetivo extends Calculos {

	private int ob;
	private double resultado = 0, proteina = 0, carbo = 0, gordura = 0;

	Scanner leia = new Scanner(System.in);

	public void objetivoEscolhido() 
	{
		do 
		{
			System.out.println("\n\nEntre com seu objetivo (1)Manter (2)Perda (3)Ganho: ");
			ob = leia.nextInt();
			switch (ob) 
			{
			case 1:				
				System.out.println("\n\t\tExercícios para manter massa muscular:"
						+ "\n1 - Caminhada de baixa intensidade por 10 minutos;" + "\n2 - Aulas de yoga;" + "\n3 - Alongamentos;" + "\n4 - Pilates.");
				
				proteina = (getTmb() * 40) / 100;
				gordura = (getTmb() * 40) / 100;
				carbo = (getTmb() * 20) / 100;

				System.out.printf("\nPara manter seu peso em manutenção, consuma %.0f calorias por dia!\n", getTmb());
				System.out.printf("\n%.0f gramas proteina;", proteina);
				System.out.printf("\n%.0f gramas gordura;", gordura);
				System.out.printf("\n%.0f gramas carboidrato.\n", carbo);
				break;
				
			case 2:				
				resultado = (getTmb() - 500);
				System.out.println("\n");
				System.out.println("Exercícios para perder massa muscular\r\n" + "\n1 - Uma hora de bicicleta \r\n"
						+ "2 - Uma hora de esteira em velocidade intensa		\r\n" + "3 - Uma hora natação");
				
				proteina = (resultado * 40) / 100;
				gordura = (resultado * 40) / 100;
				carbo = (resultado * 20) / 100;
				
				System.out.printf("\nPara entrar em déficit calórico, consuma %.0f calorias por dia!\n", resultado);
				System.out.printf("\n%.0f gramas proteina;", proteina);
				System.out.printf("\n%.0f gramas gordura;", gordura);
				System.out.printf("\n%.0f gramas carboidrato.\n", carbo);
				break;
				
			case 3:				
				resultado = (getTmb() + 500);
				System.out.println("\nExercícios para ganhar massa muscular\r\n" + "\n1 - Levantamento de peso.\r\n"
						+ "2 - Treinamento suspenso ou TRX\r\n" + "3 - Funcional\r\n" + "4 - Boxe");
				
				proteina = (resultado * 40) / 100;
				gordura = (resultado * 40) / 100;
				carbo = (resultado * 20) / 100;
				
				System.out.printf("\nPara ganho de massa, consuma %.0f calorias por dia!\n", resultado);
				System.out.printf("\n%.0f gramas proteina;", proteina);
				System.out.printf("\n%.0f gramas gordura;", gordura);
				System.out.printf("\n%.0f gramas carboidrato.\n", carbo);
				break;

			default:
				System.out.printf("Você digitou uma opção inválida!");
			}
		} 
		while (ob > 3);
		
	
		System.out.println("\n\nAgradecemos por utilizar o nosso programa!");
		}

}
