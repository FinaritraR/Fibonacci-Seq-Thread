import java.util.*;

public class ThreadPrime extends Thread{
	
	static Thread thread;
	public static void main(String[] args) {
		System.out.println("_____________________________________________________");
		System.out.println();
		System.out.println("Finaritra Razafimahazo ");
		System.out.println("_____________________________________________________");
		System.out.println();
		
		thread = new ThreadPrime();
		thread.start();

		}
	@Override
	public void run(){
		System.out.print("Entrez un nombre pour avoir les nombres premiers plus "
								+ "petit ou égale à celui-ci: ");
		
		// récupérer l'entrée de l'utilisateur
		Scanner scanner =new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		System.out.println();
		System.out.println("Voici les nombres premiers plus "
								+ "petit ou égale à " + input +":");
		
		for( int i=0; i<=input; i++){
			// si le nombre est premier donc on le montre dans la console
			if(PrimeNumber.PrimeNum(i)){
			System.out.println(">> " + i);
			}
		}
		
	}

}