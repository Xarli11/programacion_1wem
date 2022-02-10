import java.util.Scanner;

public class Ej2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Scanner sc=new Scanner(System.in);	
	int tam=10000;
      int[] numeros=new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)((Math.random()*100)+1);
		}
		//recorrido
		for (int i =1;i<numeros.length ;i=i+2) {
			System.out.println("valor de posicion "+i+" es "+numeros[i]);
		}
	}

}
