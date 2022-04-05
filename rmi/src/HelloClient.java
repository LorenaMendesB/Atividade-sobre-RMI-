import java.rmi.registry.*;
import java.util.Scanner;

public class HelloClient {
	public static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in); 
		
		float a, b, c;
		try {
			
			// Procura o registro do RMI no Servidor
			// Se o servidor estiver em outro host basta substituir pelo seu IP
			Registry registry = LocateRegistry.getRegistry("localhost");
			// Procura a stub do servidor
			Hello stub= (Hello) registry.lookup("Servidor");
			// Chama o método do servidor e imprime a mensagem
			System.out.println("Invocando metodo do servidor");
			System.out.print("Digite o valor de A:");
			a= ler.nextFloat();
			System.out.print("Digite o valor de B:");
			b= ler.nextFloat();
			System.out.print("Digite o valor de C:");
			c= ler.nextFloat();
			float msg = stub.delta(a,b,c);
			System.out.println("O valor de delta é: " + msg); 
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}





