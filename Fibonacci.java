
import java.util.*;


public class Fibonacci{

	// dès que l'on crée un objet de Fibonacci le calcul du nombre de fibonacci est entamé
	//voici le constructeur
	public Fibonacci() {
		
		double valeur1 = 1;
		double valeur0 = 0;
		double valeurfib = 0;
				
		System.out.println();
		System.out.println("Execution: ");
		System.out.println("n°0 ---> Valeur Fibonacci: 0");
		System.out.println("n°1 ---> Valeur Fibonacci: 1");
		for (int i = 0; i <= ThreadFibonacciNum.input; i++) {
			
			//on vérifie si le nombre est plus de 2 donc on commence à calculer la valeur de fibonacci 
			if (i > 2) {
			
				valeurfib = valeur0 + valeur1;
				
				System.out.println("n°"+i+" ---> Valeur Fibonacci: "+ valeurfib);
				valeur0 = valeur1;
				valeur1 = valeurfib;
			}
		}
	}
}
