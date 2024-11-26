package ACT3_HugodelaTorreGil;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args){
		
		Random random = new Random();
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(9+2);
			System.out.println(numeros[i]);
			
			int num1= 1;
		}
		
		
		
	}
	
	
	
}