import java.util.Scanner;

public class Ej4Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tam = 100, contador = 0;
		int num;
		boolean esta = false;
		String mensaje="";
		int[] datos = new int[tam];
		for (int i = 0; i < datos.length; i++) {

			datos[i] = (int) ((Math.random() * 100) + 1);
		}
		do {
			System.out.println("intro numero a buscar entre 1 y 100");
			num = sc.nextInt();
		} while (num < 1 || num > 100);
	System.out.println("numero buscado es "+num);
		// procedemos a buscar
for (int i = 0; i < datos.length; i++) {
	System.out.println(datos[i]);
	if (datos[i]==num) {
		esta=true;
		mensaje+="está en la posicion "+i;
	}
}
if (esta) {
	System.out.println(mensaje);
}else {
	System.out.println("el "+num+" no estaba");
}
		System.out.println("fin");
	}

}
