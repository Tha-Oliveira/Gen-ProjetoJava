package com.sistema.academia;

import java.util.Scanner;
import com.sistema.academia.model.Acesso;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op = 0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
	
		Acesso novo = new Acesso();
		
		System.out.println("***********************************");
		System.out.println("\tBEM - VINDE! ");
		System.out.println("***********************************");
		System.out.println("Digite (1) para se cadastrar em nosso programa");
		System.out.println("Digete (2) para alunes cadastrados");
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			novo.primeiroAcesso();
			break;
		case 2:
			novo.aluneCadastrado();

	}

}
}