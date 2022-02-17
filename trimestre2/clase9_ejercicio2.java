package nombres;

public class Nombres {
	String nombres[];
	public int contador = 0;
	public Nombres(int max_nombres) {
		nombres = new String[max_nombres];
	}
	int añadir(String nombre) {
		int sol=-2;
		for (int i = 0; i < nombres.length; i++) {
			if (contador==nombres.length) {
				sol=-1;
			}
			else if(nombre==nombres[i]) {
				sol=1;
			}
			else {
				nombres[i]=nombre;
				sol=0;
			}
		}
		return sol;
	};
	boolean eliminar(String nombre) {
		boolean s=false;
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i]==nombre) {
				s=true;
				nombres[i]="";
			}
		}
		return s;
	}
	void vaciar() {
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]="";
		}
	}
	String mostrar(int pos) {
		String name=nombres[pos];
		return name;
	}
	int numNombres(){
		 int num=0;
		 for (int i = 0; i < nombres.length; i++) {
			if (nombres[i]!="" && nombres[i]!=" ") {
				num++;
			}
		}
		 return num; 
	}
	int maxNombres() {
		int max=nombres.length;
		return max;
	}
	boolean estaLlena() {
		boolean sol=false;
		if (contador==nombres.length) {
			sol=true;
		}
		return sol;
	}
}
