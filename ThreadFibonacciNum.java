import java.util.*;

public class ThreadFibonacciNum extends Thread {

	static int input;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("_____________________________________________________");
		System.out.println();
		System.out.println("Finaritra Razafimahazo ");
		System.out.println("_____________________________________________________");
		System.out.println();
				
		Thread child = new Thread();
		child.start();

		/*
		On synchronise le thread que l'on vient de créer et on récupère le nombre que 
		l'utilisateur nous donne pour savoir la quantité de nombre de fibonacci
		que l'ont doit montrer
		
		*/
		
		
		
		synchronized (child) {
			try {
				// entrée de l'utilisateur	
				Scanner scanner = new Scanner(System.in);
				System.out.println();
				System.out.print("Entrez le nombre de la suite de Fibonacci: ");
				input = scanner.nextInt();
				child.join(); 

			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
			// on crée un objet de Fibonacci qui extends Thread pour pouvoir créer un thread
			// dans le constructeur de Fibonacci il y a la logique qui nous donne
			// un nombre de fibonacci
			Fibonacci fib = new Fibonacci();		
		}
	}

	

	public class ThreadChild extends Thread {
		@Override
		public void run() {
				synchronized (this) {
				Fibonacci fib = new Fibonacci();
		        notify();
			}

		}

	}

}
