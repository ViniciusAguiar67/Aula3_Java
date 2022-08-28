package For_tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = ler.nextInt();
		System.out.println("\n\n");
		
		for(int x = 0; x<=10; x++) {
		
			System.out.println(n + " X " + x + " = "  + n*x);
			
		}
		
	}

}
