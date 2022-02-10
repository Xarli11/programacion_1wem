import java.util.Scanner;

public class cuatrobi {

private static int[][] crearArrayBidim
(int filas,int cols,int minimo,int maximo){
	int[][] miArray=new int[filas][cols];
	for (int i = 0; i < miArray.length; i++) {
		for (int j = 0; j < miArray[i].length; j++) {
miArray[i][j]=(int)(Math.random()*(maximo-minimo+1)+minimo);
		}
	}
	return miArray;
}
private static void verArrayBidim(int[][] vector) {
	for (int i = 0; i < vector.length; i++) {
		for (int j = 0; j < vector[i].length; j++) {
			System.out.print(vector[i][j]+"\t");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] array1=crearArrayBidim(3,4,0,100);
		verArrayBidim(array1);
		boolean encontrado=false,seguir=true;
		int buscar,fila,col;
		do {
			System.out.println("dame valor a buscar");
			buscar=sc.nextInt();
			fila=-1;
			col=-1;
			encontrado=false;
			//busqueda
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					if (array1[i][j]==buscar) {
						encontrado=true;
						fila=i;
						col=j;
						break;
					}
				}//for interno
				if (encontrado) {
					break;
				}
				
			}//aqui termina la busqueda
			if (encontrado) {
System.out.println("el valor "+buscar+
		" estaba en la fila "+fila+" y columna "+col);
			}else {
				System.out.println("el valor "+buscar+
				" no estaba" );
			}
			System.out.println("seguir buscando valores");
			seguir=sc.nextBoolean();
		}while (seguir);

	}

}
