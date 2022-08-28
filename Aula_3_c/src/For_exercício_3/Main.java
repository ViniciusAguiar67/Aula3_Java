package For_exercício_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o valor de inicio do intervalo: ");
		int n1 = ler.nextInt();
		System.out.println();
		System.out.print("Entre com o valor final do intervalo: ");
		int n2 = ler.nextInt();
		System.out.println();
		
		for (int i = n1; i <= n2; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
	}

}
