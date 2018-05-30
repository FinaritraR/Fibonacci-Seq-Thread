import java.util.*;

public class PrimeNumber {
	
	public static boolean PrimeNum(int n){
		Boolean premier = true;
	
		// on vérifie si le nombre est premier et on retourne l'information TRUE ou FALSE
		// avec la variable premier
		if(n<=1){
			premier=false;
		}
		else{
			
	for(int i=2; i<n; i++){
	
	if(((n!=i)&&(n%i)==0)){
		premier=false;
		break;
	}
   }
  }
		return premier;	
	}
}
