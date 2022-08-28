package Do_while_exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int n1;
		int n2;
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\n\nESCOLHA UMA OPÇÃO: ");
			System.out.println("1 - Somar");
			System.out.println("2 - Multiplicar");
			System.out.println("3 - Subtrair");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");
			
			System.out.print("\n\nOpção escolhida: ");
			n = ler.nextInt();
			
			if(n>5) {
				System.out.println("\n\n*****Opção invalida*****");
			}
			
			switch(n) {
			
			case 1:
				System.out.print("\nEntre com o Primeiro valor: ");
				n1 = ler.nextInt();
				System.out.print("Entre com o Segundo valor: ");
				n2 = ler.nextInt();
				
				x = n1+n2;
				
				System.out.println("\nO valor da Soma e: " + x);
				break;
			
		    case 2:
				System.out.print("\nEntre com o Primeiro valor: ");
				n1 = ler.nextInt();
				System.out.print("Entre com o Segundo valor: ");
				n2 = ler.nextInt();
			
				x = n1*n2;
			
				System.out.println("\nO valor da Multiplicação e: " + x);
				break;
				
		    case 3:
				System.out.print("\nEntre com o Primeiro valor: ");
				n1 = ler.nextInt();
				System.out.print("Entre com o Segundo valor: ");
				n2 = ler.nextInt();
			
				x = n1-n2;
			
				System.out.println("\nO valor da Subtração e: " + x);
				break;
				
		    case 4:
				System.out.print("\nEntre com o Primeiro valor: ");
				n1 = ler.nextInt();
				System.out.print("Entre com o Segundo valor: ");
				n2 = ler.nextInt();
			
				x = n1/n2;
			
				System.out.println("\nO valor da Divisão e: " + x);
				break;
		}
			
		}while(n!=5);
		
	}

}
