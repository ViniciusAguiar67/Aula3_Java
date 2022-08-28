package While_exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		int n = 1;
		double nota;
		double maior = 0;
		double menor = 0;
		double soma = 0;
		int aprovado = 0;

		while (n < 11) {
			System.out.print("Entre com a " + n + "º nota:");
			nota = ler.nextDouble();
			soma += nota;
			
			if (menor == 0) {
				menor = nota;
			}
			
			if (menor >= nota) {
				menor = nota;
			}

			if (maior <= nota) {
				maior = nota;
			}

			if (nota >= 6) {
				aprovado++;
			}

			n++;
		}

		System.out.println("\n\n");
		System.out.println("A maior nota: " + String.format("%.2f", maior));
		System.out.println("A menor nota: " + String.format("%.2f", menor));
		System.out.println("A média: " + String.format("%.2f", soma / 10));
		System.out.println("Alunos aprovado: " + aprovado);

	}

}
