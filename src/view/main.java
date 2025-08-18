package view;

import java.util.Scanner;
import controller.DivController;

// Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
// subtrações, exiba o resto da divisão. Os números de entrada devem ser números inteiros.

public class main {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		DivController DivController = new DivController();
		
		System.out.println("Digite o numero que será o dividendo: ");
		int x = in.nextInt();
		System.out.println("Digite o numero que será o divisor: ");
		int y = in.nextInt();
		
		if(y != 0) {
			int result = DivController.resto(x, y);
			
			System.out.println("O resultado da divisao é: " + result);
		} else {
			System.out.println("Nn existe divisao por 0!");
		}
	}

}
