package beecrowd;

import java.util.Scanner;
import java.text.DecimalFormat;
public class PosicaoVetor {
	static int[] Vetor = new int[10];
	static Scanner console = new Scanner(System.in);
	static DecimalFormat format = new DecimalFormat("0.00");
	static int index = 0;
	static void mostrarMenu() {
		System.out.println("\n\n");
		System.out.println("\t Menu");
		System.out.println("[ 1 ] Mostrar n�meros: ");
		System.out.println("[ 2 ] Editar posi��es: ");
		System.out.println("[ 3 ] Mostrar posi��es com n�mero menor que 10: ");
		System.out.println("[ 0 ] Sair do Menu: ");
		System.out.println("\n Digite a op��o:");

		byte opcao = console.nextByte();
		switch (opcao) {
		case 0:
			System.err.println("Saiu do Menu");
			System.exit(opcao);
			break;
		case 1:
			mostrar();
			break;
		case 2:
			System.out.println("Editar posi��es:");
			setPosicao();
			break;
		case 3:
			mostrarNum();
			break;
		default:
			System.err.println("Op��o inv�lida");
			mostrarMenu();
			break;
		}
		mostrarMenu();
	}
	static public void mostrar() {
		for (int i = 0; i < Vetor.length; i++) {
		    System.out.print(" | " + Vetor[i]);
		}
	}
	
	static public void setPosicao() {
		int num = 0; 
		for (int i = 0; i < Vetor.length; i++) {
			System.out.printf("Digite o valor da posi��o %d:\n", i);
			num = console.nextInt();
			Vetor[i] = num;
		}
	}
	//Mostra todos os n�meros menores ou igual a 10 presentes no vetor.
	static public void mostrarNum() { 
		for (int i = 0; i < Vetor.length; i++) {
			if (Vetor[i] <= 10) {
				System.out.printf("Posi��o %d: %d\n", i, Vetor[i]);
			}
		}	
	}

	public static void main(String[] args) {
		mostrarMenu();

	
	
	
	
	}

}
