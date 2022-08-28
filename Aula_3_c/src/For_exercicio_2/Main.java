package For_exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com um valor do intervalo: ");
		int n = ler.nextInt();
		System.out.println("\n\n");
		System.out.print("Os valores pares sao: ");
		System.out.println("\n\n");

		for (int i = n; i <= 1000; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			
		}
	}
}
}
