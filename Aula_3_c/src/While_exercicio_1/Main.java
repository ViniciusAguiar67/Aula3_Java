package While_exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma_val = 0;
		int n ; 
		
		Scanner ler = new Scanner(System.in);
		
		while(true) {
			System.out.print("Entre com o valor: ");
			n = ler.nextInt();
			soma_val+= n;
			
			if(n==0) {
				break;	
			}
		}
		
		System.out.println(soma_val);

}
}